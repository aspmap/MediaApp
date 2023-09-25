package run.itlife.mediaapp.entities.works;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@Table(name = "cinema_works")
@DiscriminatorValue("cinema_works")
public class CinemaWorks extends Works {

    @Column(name = "tagline")
    private String tagline;

    @Column(name = "director")
    private String director;

    @Column(name = "scenario")
    private String scenario;

    @Column(name = "producer")
    private String producer;

    @Column(name = "operator")
    private String operator;

    @Column(name = "composer")
    private String composer;

    @Column(name = "costume_designer")
    private String costumeDesigner;

    @Column(name = "video_editing")
    private String videoEditing;

    @Column(name = "budget")
    private String budget;

    @Column(name = "fees")
    private String fees;

    @Column(name = "world_premiere")
    private String worldPremiere;

    @Column(name = "dvd_release")
    private String DVDrelease;

    @Column(name = "bluray_release")
    private String BluRayRelease;

    @Column(name = "age_to_view")
    private String ageToView;

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getCostumeDesigner() {
        return costumeDesigner;
    }

    public void setCostumeDesigner(String costumeDesigner) {
        this.costumeDesigner = costumeDesigner;
    }

    public String getVideoEditing() {
        return videoEditing;
    }

    public void setVideoEditing(String videoEditing) {
        this.videoEditing = videoEditing;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getWorldPremiere() {
        return worldPremiere;
    }

    public void setWorldPremiere(String worldPremiere) {
        this.worldPremiere = worldPremiere;
    }

    public String getDVDrelease() {
        return DVDrelease;
    }

    public void setDVDrelease(String DVDrelease) {
        this.DVDrelease = DVDrelease;
    }

    public String getBluRayRelease() {
        return BluRayRelease;
    }

    public void setBluRayRelease(String bluRayRelease) {
        BluRayRelease = bluRayRelease;
    }

    public String getAgeToView() {
        return ageToView;
    }

    public void setAgeToView(String ageToView) {
        this.ageToView = ageToView;
    }

}
