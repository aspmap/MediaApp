package run.itlife.mediaapp.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import run.itlife.mediaapp.entities.persons.Persons;
import run.itlife.mediaapp.entities.projects.Projects;
import run.itlife.mediaapp.entities.works.Works;

import java.util.Optional;

public interface WorksRepository extends CrudRepository<Works, String> {

    /**
     * JPQL-запрос на выборку работ по ID проекта
     * @param projectId ID проекта
     * @return Коллекция работ
     */
    @Query(value = "select w from Works w where w.project.projectId = :projectId")
    Iterable<Works> findWorksByProjectId(@Param("projectId") String projectId);


    /**
     * JPQL-запрос на выборку проектов по ID медиа
     * @param mediaId ID медиа
     * @return Коллекция проектов
     */
    @Query(value = "select w from Works w, MediaInfo mi where mi.work.workId = w.workId and mi.mediaId = :mediaId")
    Optional<Works> findWorkByMediaId(@Param("mediaId") String mediaId);

}
