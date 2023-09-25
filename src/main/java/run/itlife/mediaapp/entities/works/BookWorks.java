package run.itlife.mediaapp.entities.works;


import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@Table(name = "book_works")
@DiscriminatorValue("book_works")
public class BookWorks extends Works {

    @Column(name = "isbn")
    private String ISBN;

    @Column(name = "author")
    private String author;

    @Column(name = "publishing_house")
    private String publishingHouse;

    @Column(name = "publication_language")
    private String publicationLanguage;

    @Column(name = "publication_format")
    private String publicationFormat;

    @Column(name = "circulation")
    private String circulation;

    @Column(name = "book_type")
    private String bookType; // TODO В enum - Печатная книга, электронная книга

    @Column(name = "number_of_pages")
    private String numberOfPages;

    @Column(name = "cover_type")
    private String coverType;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getPublicationLanguage() {
        return publicationLanguage;
    }

    public void setPublicationLanguage(String publicationLanguage) {
        this.publicationLanguage = publicationLanguage;
    }

    public String getPublicationFormat() {
        return publicationFormat;
    }

    public void setPublicationFormat(String publicationFormat) {
        this.publicationFormat = publicationFormat;
    }

    public String getCirculation() {
        return circulation;
    }

    public void setCirculation(String circulation) {
        this.circulation = circulation;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }
}
