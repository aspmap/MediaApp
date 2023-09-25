package run.itlife.mediaapp.entities.info;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

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
