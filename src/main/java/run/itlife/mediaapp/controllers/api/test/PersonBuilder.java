package run.itlife.mediaapp.controllers.api.test;

import run.itlife.mediaapp.entities.persons.Persons;

public class PersonBuilder {

    private static PersonBuilder instance = new PersonBuilder();
    private String id = null;
    private String info = "";

    private PersonBuilder() {

    }

    public static PersonBuilder create() {
        return instance;
    }

    public PersonBuilder withInfo(String info) {
        this.info = info;
        return instance;
    }

    public PersonBuilder withId(String id) {
        this.id = id;
        return instance;
    }

    public Persons build() {
        Persons result = new Persons(this.info);
        if(id != null) {
            result.setPersonId(id);
        }
        return result;
    }
}
