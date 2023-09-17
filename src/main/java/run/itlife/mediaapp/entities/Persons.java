package run.itlife.mediaapp.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Persons {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @NotNull
    @Column(name = "person_id")
    private String id;

    private String lastname;
    private String firstname;
    private String patronymic;
    private String photo;
    @NotNull
    @NotBlank
    private String info;
    private String website;
    private String email;
    private String phone;
    private String sex;

    @Column(insertable = true, updatable = false)
    private LocalDateTime birthdate;

    public Persons() {
        this.id = UUID.randomUUID().toString();
        this.lastname = "lastname";
        this.firstname = "firstname";
        this.patronymic = "patronymic";
        this.info = "info";
        this.birthdate = LocalDateTime.now();
    }

    public Persons(String info) {
        this.info = info;
    }

    @PrePersist
    void onCreate() {
        this.setBirthdate(LocalDateTime.now());
    }

    @PreUpdate
    void onUpdate() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDateTime birthdate) {
        this.birthdate = birthdate;
    }
}