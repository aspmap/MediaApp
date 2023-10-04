package run.itlife.mediaapp.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import run.itlife.mediaapp.entities.info.MediaInfo;
import run.itlife.mediaapp.entities.persons.Persons;
import run.itlife.mediaapp.entities.works.Works;

public interface MediaInfoRepository extends CrudRepository<MediaInfo, String> {

    /**
     * JPQL-запрос на выборку медиа по ID работы
     * @param workId ID работы
     * @return Коллекция медиа
     */
    @Query(value = "select mi from MediaInfo mi where mi.work.workId = :workId")
    Iterable<MediaInfo> findMediaByWorkId(@Param("workId") String workId);

}
