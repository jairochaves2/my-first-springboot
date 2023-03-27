package com.jairochaves.servicies;

import com.jairochaves.exceptions.ResourceNotFoundException;
import com.jairochaves.models.Person;
import com.jairochaves.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;

    public List<Person> findAll() {
        logger.info("Finding all person");
        return repository.findAll();
    }

    public Person create(Person p) {
        logger.info("Create person");
        return repository.save(p);
    }

    public Person findById(Long id) {
        logger.info("Finding one person");
        Person person = new Person();

        person.setId(id);
        person.setFirstName("Leandro");
        person.setLastName("Silva");
        person.setAddress("Sobral");
        person.setGender("Male");

        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
    }

    public Person update(Person p) {
        logger.info("Update person");
        var entity = repository.findById(p.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
        entity.setFirstName(p.getFirstName());
        entity.setLastName(p.getLastName());
        entity.setAddress(p.getAddress());
        entity.setGender(p.getGender());
        return repository.save(p);
    }

    public void delete(Long id) {
        logger.info("Deleting person");
        var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
        repository.delete(entity);
    }
}
