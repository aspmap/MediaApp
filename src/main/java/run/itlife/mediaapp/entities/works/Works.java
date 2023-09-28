package run.itlife.mediaapp.entities.works;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.GenericGenerator;
import run.itlife.mediaapp.entities.info.MediaInfo;
import run.itlife.mediaapp.entities.persons.Persons;
import run.itlife.mediaapp.entities.projects.Projects;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "works")
public class Works {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @NotNull
    @Column(name = "work_id")
    private String workId;

    @ManyToOne
    @JoinColumn(name = "project_id")
    @JsonBackReference
    private Projects project;

    @OneToMany(mappedBy = "work",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonManagedReference
    List<MediaInfo> works = new ArrayList<>();

    @Column(name = "title")
    private String title;

    @Column(name = "original_title")
    private String originalTitle;

    @Column(name = "date_begin")
    private String dateBegin;

    @Column(name = "date_end")
    private String dateEnd;

    @Column(name = "release_date")
    private String releaseDate;

    @Column(name = "recording_date")
    private String recordingDate;

    @Column(name = "duration")
    private String duration;

    @NotNull
    @NotBlank
    @Column(name = "info")
    private String info;

    @Column(name = "website")
    private String website;

    @Column(name = "photo")
    private String photo;

    @Column(name = "logo")
    private String logo;

    @Column(name = "country")
    private String country;

    @Column(name = "type_of_release")
    private String typeOfRelease; // TODO EP, LP, Single, Film etc. В enum

    @Column(name = "format_release")
    private String formatRelease; // TODO Формат релиза - mp3, CD, DVD etc. В enum

    @Column(name = "style_genre")
    private String styleGenre; // TODO Стиль или жанр

    @Column(name = "type_of_work")
    private String typeOfWork; // TODO Альбом, фильм, сериал, книга и т.д. В enum

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(String dateBegin) {
        this.dateBegin = dateBegin;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTypeOfRelease() {
        return typeOfRelease;
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

    public void setTypeOfRelease(String typeOfRelease) {
        this.typeOfRelease = typeOfRelease;
    }

    public String getFormatRelease() {
        return formatRelease;
    }

    public String getWorkId() {
        return workId;
    }

    public void setFormatRelese(String formatRelease) {
        this.formatRelease = formatRelease;
    }

    public String getStyleGenre() {
        return styleGenre;
    }

    public void setStyleGenre(String styleGenre) {
        this.styleGenre = styleGenre;
    }

    public String getTypeOfWork() {
        return typeOfWork;
    }

    public void setTypeOfWork(String typeOfWork) {
        this.typeOfWork = typeOfWork;
    }

    public List<MediaInfo> getWorks() {
        return works;
    }

    public void setWorks(List<MediaInfo> works) {
        this.works = works;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public Projects getProject() {
        return project;
    }

    public void setProject(Projects project) {
        this.project = project;
    }

}
