package run.itlife.mediaapp.entities.info;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.GenericGenerator;
import run.itlife.mediaapp.entities.projects.Projects;
import run.itlife.mediaapp.entities.works.Works;

@Entity
@Table(name = "media_info")
//@Inheritance(strategy = InheritanceType.JOINED)
// для MediaInfo лучше использовать стратегию "Единая таблица для всей иерархии классов"
public /*abstract*/ class MediaInfo {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @NotNull
    @Column(name = "media_id")
    private String mediaId;

    @ManyToOne
    @JoinColumn(name = "work_id")
    @JsonBackReference
    private Works work;


    @Column(name = "title", length = 100)
    private String title;

    @Column(name = "release_date")
    private String releaseDate;

    @Column(name = "recording_date")
    private String recordingDate;

    @Column(name = "duration")
    private String duration; // продолжительность альбома, фильма

    @Column(name = "version")
    private String version;


    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Works getWork() {
        return work;
    }

    public void setWork(Works work) {
        this.work = work;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRecordingDate() {
        return recordingDate;
    }

    public void setRecordingDate(String recordingDate) {
        this.recordingDate = recordingDate;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
