package com.jairochaves.servicies;

import com.jairochaves.models.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll() {
        logger.info("Finding all person");
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            Person p = mockPerson(i);
            persons.add(p);
        }
        return persons;
    }

    public Person create(Person p) {
        logger.info("Create person");
        return p;
    }

    public Person findById(String id) {
        logger.info("Finding one person");
        Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setFirstName("Leandro");
        person.setLastName("Silva");
        person.setAddress("Sobral");
        person.setGender("Male");

        return person;
    }

    public Person update(Person p) {
        logger.info("Update person");
        return p;
    }

    public void delete(String id) {
        logger.info("Deleting person");
    }
    private Person mockPerson(int i) {
        Person p = new Person();
        p.setId(Long.valueOf(i));
        p.setFirstName("Leandro " + i);
        p.setLastName("Silva " + i);
        p.setAddress("Sobral " + i);
        p.setGender("Male");
        return p;
    }


}
