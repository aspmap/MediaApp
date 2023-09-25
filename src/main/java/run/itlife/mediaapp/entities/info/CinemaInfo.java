package run.itlife.mediaapp.entities.info;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@Table(name = "cinema_info")
@DiscriminatorValue("cinema_info")
public class CinemaInfo extends MediaInfo {

    @Column(name = "seasons")
    private String seasons;

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }
}
