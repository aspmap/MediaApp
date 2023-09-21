package run.itlife.mediaapp.entities.info;

import jakarta.persistence.Entity;

@Entity
public class AlbumInfo extends MediaInfo {

    private String typeAlbum;

    public String getTypeAlbum() {
        return typeAlbum;
    }

    public void setTypeAlbum(String typeAlbum) {
        this.typeAlbum = typeAlbum;
    }
}
