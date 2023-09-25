package run.itlife.mediaapp.entities.persons;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.GenericGenerator;
import run.itlife.mediaapp.entities.projects.Projects;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "persons")
public class Persons {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @NotNull
    @Column(name = "person_id")
    private String personId;

    @OneToMany(mappedBy = "person",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonManagedReference
    List<Projects> projects = new ArrayList<>();

    @NotNull
    @Column(name = "lastname")
    private String lastname;

    @NotNull
    @Column(name = "firstname")
    private String firstname;

    @Column(name = "patronymic")
    private String patronymic;

    @NotNull
    @NotBlank
    @Column(name = "info")
    private String info;

    @Column(name = "birthdate", insertable = true, updatable = false)
    private LocalDateTime birthdate; // TODO разделить на год и дату с месяцем

    @Column(name = "place_of_birth")
    private String placeOfBirth;

    @Column(name = "zodiac_sign")
    private String zodiacSign;

    @Column(name = "sex")
    private String sex;

    @Column(name = "height")
    private Float height;

    @Column(name = "age")
    private Integer age; // TODO высчитываемое поле

    @Column(name = "photo")
    private String photo;

    @Column(name = "website")
    private String website;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "carrer")
    private String carrer; // TODO сценарист, музыкант, режиссер и т.д.

    @Column(name = "surwives")
    private String surwives;

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public Persons() {
        this.personId = UUID.randomUUID().toString();
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

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getZodiacSign() {
        return zodiacSign;
    }

    public void setZodiacSign(String zodiacSign) {
        this.zodiacSign = zodiacSign;
    }

    public String getSurwives() {
        return surwives;
    }

    public void setSurwives(String surwives) {
        this.surwives = surwives;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
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