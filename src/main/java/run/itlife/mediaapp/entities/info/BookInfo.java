package run.itlife.mediaapp.entities.info;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@Table(name = "book_info")
@DiscriminatorValue("book_info")
public class BookInfo extends MediaInfo {

    @Column(name = "pages")
    private String pages;

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }
}
