package run.itlife.mediaapp.entities.info;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import run.itlife.mediaapp.entities.comments.TrackComments;
import run.itlife.mediaapp.entities.projects.Projects;

import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = "music_info")
@DiscriminatorValue("music_info")
public class MusicInfo extends MediaInfo {

    @Column(name = "style")
    private String style;

    @Column(name = "version_track")
    private String versionTrack; // radio, extended, club и т.д.

    @Column(name = "song_number")
    private String songNumber; // номер песни

    @Column(name = "lyrics")
    private String lyrics;

    @Column(name = "number_of_plays")
    private String numberOfPlays;

    @Column(name = "link_to_track")
    private String linkToTrack;

    @Column(name = "other_links")
    private String otherLinks;

/*    @OneToMany(mappedBy = "comment",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonManagedReference
    List<TrackComments> comments = new ArrayList<>();*/

    public String getOtherLinks() {
        return otherLinks;
    }

    public void setOtherLinks(String otherLinks) {
        this.otherLinks = otherLinks;
    }

    public String getNumberOfPlays() {
        return numberOfPlays;
    }

    public void setNumberOfPlays(String numberOfPlays) {
        this.numberOfPlays = numberOfPlays;
    }

    public String getLinkToTrack() {
        return linkToTrack;
    }

    public void setLinkToTrack(String linkToTrack) {
        this.linkToTrack = linkToTrack;
    }

/*    public List<TrackComments> getComments() {
        return comments;
    }

    public void setComments(List<TrackComments> comments) {
        this.comments = comments;
    }*/

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getSongNumber() {
        return songNumber;
    }

    public void setSongNumber(String songNumber) {
        this.songNumber = songNumber;
    }


    public String getVersionTrack() {
        return versionTrack;
    }

    public void setVersionTrack(String versionTrack) {
        this.versionTrack = versionTrack;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
