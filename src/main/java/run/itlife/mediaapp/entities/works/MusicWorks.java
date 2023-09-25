package run.itlife.mediaapp.entities.works;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.jdbc.Work;

@Entity
//@Table(name = "music_works")
@DiscriminatorValue("music_works")
public class MusicWorks extends Works {

    @Column(name = "lyricist")
    private String lyricist;

    @Column(name = "vocals")
    private String vocals;

    @Column(name = "backing_vocals")
    private String backingVocals;

    @Column(name = "guitar")
    private String guitar;

    @Column(name = "design")
    private String design;

    @Column(name = "models")
    private String models;

    @Column(name = "dancers")
    private String dancers;

    @Column(name = "recording_in_studios")
    private String recordingInStudios;

    @Column(name = "version")
    private String version;

    @Column(name = "barcode")
    private String barcode;

    @Column(name = "matrix")
    private String matrix;

    @Column(name = "sid")
    private String SID;

    @Column(name = "mastering")
    private String mastering;

    @Column(name = "mixing")
    private String mixing;

    @Column(name = "style")
    private String style;

    public String getVocals() {
        return vocals;
    }

    public void setVocals(String vocals) {
        this.vocals = vocals;
    }

    public String getBackingVocals() {
        return backingVocals;
    }

    public void setBackingVocals(String backingVocals) {
        this.backingVocals = backingVocals;
    }

    public String getGuitar() {
        return guitar;
    }

    public void setGuitar(String guitar) {
        this.guitar = guitar;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getDancers() {
        return dancers;
    }

    public void setDancers(String dancers) {
        this.dancers = dancers;
    }

    public String getRecordingInStudios() {
        return recordingInStudios;
    }

    public void setRecordingInStudios(String recordingInStudios) {
        this.recordingInStudios = recordingInStudios;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getMatrix() {
        return matrix;
    }

    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getMastering() {
        return mastering;
    }

    public void setMastering(String mastering) {
        this.mastering = mastering;
    }

    public String getMixing() {
        return mixing;
    }

    public void setMixing(String mixing) {
        this.mixing = mixing;
    }

    public String getLyricist() {
        return lyricist;
    }

    public void setLyricist(String lyricist) {
        this.lyricist = lyricist;
    }
}
