-- liquibase formatted sql
-- changeset Pavel:1

CREATE TABLE phones(
    id serial PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE booking(
    phone_id INTEGER PRIMARY KEY,
    tester_name VARCHAR(255),
    bookingdate timestamp,
    CONSTRAINT fk_phones
        FOREIGN KEY(phone_id)
        REFERENCES phones(id)
);

INSERT INTO phones(name) values
('Samsung Galaxy S9'),
('2x Samsung Galaxy S8'),
('Motorola Nexus 6'),
('Oneplus 9'),
('Apple iPhone 13'),
('Apple iPhone 12'),
('Apple iPhone 11'),
('iPhone X'),
('Nokia 3310')
