package run.itlife.mediaapp.controllers.api;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import run.itlife.mediaapp.controllers.api.test.PersonBuilder;
import run.itlife.mediaapp.entities.persons.Persons;
import run.itlife.mediaapp.repositories.PersonsRepository;
import run.itlife.mediaapp.validation.PersonsValidationError;
import run.itlife.mediaapp.validation.PersonsValidationErrorBuilder;

import java.net.URI;
import java.util.Optional;


import static org.springframework.http.HttpStatus.*;
import static run.itlife.mediaapp.messages.ErrorMessages.*;
import static run.itlife.mediaapp.messages.ErrorMessages.NOT_FOUND;

@RestController
@RequestMapping("/api")
public class PersonsController {

    private PersonsRepository personsRepository;

    private Logger log = LoggerFactory.getLogger(PersonsController.class);

    @Autowired
    public PersonsController(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    /**
     * Поиск всей информации по всем персонам
     *
     * @return
     */
    @GetMapping("/persons")
    //@CrossOrigin(origins = "*")
    public ResponseEntity<Iterable<Persons>> getPersons() {
        return ResponseEntity.ok(personsRepository.findAll());
    }

    /**
     * Поиск информации по id персоны
     *
     * @param personId ID персоны
     * @return
     */
    @GetMapping("/person/{personId}")
    public ResponseEntity<Persons> getPersonById(@PathVariable String personId) {
        Optional<Persons> person = personsRepository.findById(personId);
        if (person.isPresent()) {
            return ResponseEntity.ok(person.get());
        }
        log.error(ERROR + ResponseEntity.badRequest().body(personId) + ", Object with ID=" + personId + NOT_FOUND);
        return new ResponseEntity(OBJECT_NOT_FOUND + personId + NOT_FOUND, HttpStatus.BAD_REQUEST);
    }

    @PatchMapping("/person/{id}")
    public ResponseEntity<Persons> setCompleted(@PathVariable String id) {
        Optional<Persons> person = personsRepository.findById(id);
        if (!person.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        Persons result = person.get();
        result.setPhoto("none");
        personsRepository.save(result);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .buildAndExpand(result.getPersonId()).toUri();
        return ResponseEntity.ok().header("Location", location.toString()).build();
    }

    @RequestMapping(value = "/person", method = {RequestMethod.POST, RequestMethod.PUT})
    public ResponseEntity<?> createPerson(@Valid @RequestBody Persons persons, Errors errors) {
        if (errors.hasErrors()) {
            log.error("Bad request. Body of request must be not empty: " + ResponseEntity.badRequest().body(PersonsValidationErrorBuilder.fromBindingErrors(errors)).toString());
            return ResponseEntity.badRequest().body(PersonsValidationErrorBuilder.fromBindingErrors(errors));
        }
        Persons result = personsRepository.save(persons);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(result.getPersonId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/person/{id}")
    public ResponseEntity<Persons> deletePerson(@PathVariable String id) {
        personsRepository.delete(PersonBuilder.create().withId(id).build());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/person")
    public ResponseEntity<Persons> deletePerson(@RequestBody Persons persons) {
        personsRepository.delete(persons);
        return ResponseEntity.noContent().build();
    }

    @ExceptionHandler
    @ResponseStatus(value = BAD_REQUEST)
    public PersonsValidationError handleException(Exception exception) {
        return new PersonsValidationError(exception.getMessage());
    }
}
