package run.itlife.mediaapp.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import run.itlife.mediaapp.entities.persons.Persons;
import run.itlife.mediaapp.entities.projects.Projects;

import java.util.List;
import java.util.Optional;

public interface ProjectsRepository extends CrudRepository<Projects, String> {

    /**
     * JPQL-запрос на выборку проектов по ID персоны
     * @param personId ID персоны
     * @return Коллекция проектов
     */
    @Query(value = "select prj from Projects prj where prj.person.personId = :personId")
    Iterable<Projects> findProjectByPersonId(@Param("personId") String personId);

}
