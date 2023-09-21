package run.itlife.mediaapp.entities.info;

import jakarta.persistence.Entity;

@Entity
public class SongInfo extends MediaInfo {

    private String style;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
