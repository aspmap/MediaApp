package run.itlife.mediaapp.repositories;

import org.springframework.data.repository.CrudRepository;
import run.itlife.mediaapp.entities.persons.Persons;

public interface PersonsRepository extends CrudRepository<Persons, String> {

}
