package run.itlife.mediaapp.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import run.itlife.mediaapp.entities.persons.Persons;
import run.itlife.mediaapp.entities.projects.Projects;
import run.itlife.mediaapp.entities.works.Works;

public interface WorksRepository extends CrudRepository<Works, String> {

    /**
     * JPQL-запрос на выборку работ по ID проекта
     * @param projectId ID проекта
     * @return Коллекция работ
     */
    @Query(value = "select w from Works w where w.project.projectId = :projectId")
    Iterable<Works> findWorksByProjectId(@Param("projectId") String projectId);

}
