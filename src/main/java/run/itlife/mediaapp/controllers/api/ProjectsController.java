package run.itlife.mediaapp.controllers.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import run.itlife.mediaapp.entities.persons.Persons;
import run.itlife.mediaapp.entities.projects.Projects;
import run.itlife.mediaapp.repositories.PersonsRepository;
import run.itlife.mediaapp.repositories.ProjectsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProjectsController {

    private ProjectsRepository projectsRepository;

    private Logger log = LoggerFactory.getLogger(ProjectsController.class);

    @Autowired
    public ProjectsController(ProjectsRepository projectsRepository) {
        this.projectsRepository = projectsRepository;
    }

    /**
     * Поиск всех проектов
     * @return
     */
    @GetMapping("/projects")
    public ResponseEntity<Iterable<Projects>> getProjects(){
        return ResponseEntity.ok(projectsRepository.findAll());
    }

    /**
     * Поиск проектов по id проекта
     * @param projectId ID проекта
     * @return
     */
    @GetMapping("/project/{projectId}")
    public ResponseEntity<Projects> getProjectById(@PathVariable String projectId){
        Optional<Projects> project = projectsRepository.findById(projectId);
        if(project.isPresent()) {
            return ResponseEntity.ok(project.get());
        }
        log.error("Error: " + ResponseEntity.badRequest().body(projectId) + ", Objects with projectId=" + projectId + " not found");
        return ResponseEntity.badRequest().body(project.get());
    }

    /**
     * Поиск проектов по ID персоны
     * @param personId ID проекта
     * @return
     */
    @GetMapping("/project/person/{personId}")
    public ResponseEntity<Iterable<Projects>> getProjectByPersonId(@PathVariable String personId){
       Iterable<Projects> project = projectsRepository.findProjectByPersonId(personId);
        if(((ArrayList) project).size() != 0) {
            return ResponseEntity.ok(project);
        }
        log.error("Error: " + ResponseEntity.badRequest().body(personId) + ", Objects with personId=" + personId + " not found");
        return ResponseEntity.badRequest().body(project);
    }

}
