package run.itlife.mediaapp.entities.info;

import jakarta.persistence.Entity;

@Entity
public class CinemaInfo extends MediaInfo {

    private String seasons;

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }
}
