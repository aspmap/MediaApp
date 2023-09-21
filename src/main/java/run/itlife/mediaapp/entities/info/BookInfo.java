package run.itlife.mediaapp.entities.info;

import jakarta.persistence.Entity;

@Entity
public class BookInfo extends MediaInfo {

    private String pages;

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }
}
