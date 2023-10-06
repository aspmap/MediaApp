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
import run.itlife.mediaapp.entities.info.MediaInfo;
import run.itlife.mediaapp.entities.works.Works;
import run.itlife.mediaapp.repositories.MediaInfoRepository;
import run.itlife.mediaapp.repositories.WorksRepository;

import java.util.ArrayList;
import java.util.Optional;

import static run.itlife.mediaapp.messages.ErrorMessages.*;

@RestController
@RequestMapping("/api")
public class MediaInfoController {

    private MediaInfoRepository mediaInfoRepository;

    private Logger log = LoggerFactory.getLogger(MediaInfoController.class);

    @Autowired
    public MediaInfoController(MediaInfoRepository mediaInfoRepository) {
        this.mediaInfoRepository = mediaInfoRepository;
    }

    /**
     * Поиск всей медиа-информации
     * @return
     */
    @GetMapping("/mediainfo")
    public ResponseEntity<Iterable<MediaInfo>> getProjects(){
        return ResponseEntity.ok(mediaInfoRepository.findAll());
    }

    /**
     * Поиск медиа-информации по ID медиа
     * @param mediaId ID медиа
     * @return
     */
    @GetMapping("/mediainfo/{mediaId}")
    public ResponseEntity<MediaInfo> getMediaInfoById(@PathVariable String mediaId){
        Optional<MediaInfo> mediaInfo = mediaInfoRepository.findById(mediaId);
        if(mediaInfo.isPresent()) {
            return ResponseEntity.ok(mediaInfo.get());
        }
        log.error(ERROR + ResponseEntity.badRequest().body(mediaId) + ", " + OBJECT_NOT_FOUND + mediaId + NOT_FOUND);
        return new ResponseEntity(OBJECT_NOT_FOUND + mediaId + NOT_FOUND, HttpStatus.BAD_REQUEST);
    }

    /**
     * Поиск медиа по ID работы
     * @param workId ID работы
     * @return
     */
    @GetMapping("/mediainfo/work/{workId}")
    public ResponseEntity<Iterable<MediaInfo>> getMediaByWorkId(@PathVariable String workId){
        Iterable<MediaInfo> media = mediaInfoRepository.findMediaByWorkId(workId);
        if(((ArrayList) media).size() != 0) {
            return ResponseEntity.ok(media);
        }
        log.error(ERROR + ResponseEntity.badRequest().body(workId) + ", " + OBJECTS_NOT_FOUND_WORK_ID + workId + NOT_FOUND);
        return new ResponseEntity(OBJECTS_NOT_FOUND_WORK_ID + workId + NOT_FOUND, HttpStatus.BAD_REQUEST);
    }
}
