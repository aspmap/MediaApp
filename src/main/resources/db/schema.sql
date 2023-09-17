drop table if exists persons;

CREATE TABLE persons (
    person_id varchar(36) PRIMARY KEY,
    lastname varchar(150) NOT NULL,
    firstname varchar(150) NOT NULL,
    patronymic varchar(150),
    photo varchar(150),
    info varchar(255),
    website varchar(150),
    email varchar(50),
    phone varchar(20),
    sex varchar(7),
    test1 varchar(7),
    birthdate timestamp);