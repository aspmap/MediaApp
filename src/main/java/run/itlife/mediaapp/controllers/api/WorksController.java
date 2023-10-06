package run.itlife.mediaapp.controllers.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import run.itlife.mediaapp.entities.projects.Projects;
import run.itlife.mediaapp.entities.works.Works;
import run.itlife.mediaapp.repositories.ProjectsRepository;
import run.itlife.mediaapp.repositories.WorksRepository;

import java.util.ArrayList;
import java.util.Optional;

import static run.itlife.mediaapp.messages.ErrorMessages.*;

@RestController
@RequestMapping("/api")
public class WorksController {


    private WorksRepository worksRepository;

    private Logger log = LoggerFactory.getLogger(WorksController.class);

    @Autowired
    public WorksController(WorksRepository worksRepository) {
        this.worksRepository = worksRepository;
    }

    /**
     * Поиск всех проектов
     * @return
     */
    @GetMapping("/works")
    public ResponseEntity<Iterable<Works>> getProjects(){
        return ResponseEntity.ok(worksRepository.findAll());
    }

    /**
     * Поиск работ по ID работы
     * @param workId ID работы
     * @return
     */
    @GetMapping("/work/{workId}")
    public ResponseEntity<Works> getWorkById(@PathVariable String workId){
        Optional<Works> work = worksRepository.findById(workId);
        if(work.isPresent()) {
            return ResponseEntity.ok(work.get());
        }
        log.error(ERROR + ResponseEntity.badRequest().body(workId) + ", " + OBJECT_NOT_FOUND + workId + NOT_FOUND);
        return new ResponseEntity(OBJECT_NOT_FOUND + workId + NOT_FOUND, HttpStatus.BAD_REQUEST);
    }

    /**
     * Поиск работ по ID проекта
     * @param projectId ID проекта
     * @return
     */
    @GetMapping("/work/project/{projectId}")
    public ResponseEntity<Iterable<Works>> getWorksByProjectId(@PathVariable String projectId){
        Iterable<Works> works = worksRepository.findWorksByProjectId(projectId);
        if(((ArrayList) works).size() != 0) {
            return ResponseEntity.ok(works);
        }
        log.error(ERROR + ResponseEntity.badRequest().body(projectId) + ", " + OBJECTS_NOT_FOUND_PROJECT_ID + projectId + NOT_FOUND);
        return new ResponseEntity(OBJECTS_NOT_FOUND_PROJECT_ID + projectId + NOT_FOUND, HttpStatus.BAD_REQUEST);
    }
}
