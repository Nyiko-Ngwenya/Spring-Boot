package com.example.firstproject.Person;

//import com.example.firstproject.Student.Student;
//import com.example.firstproject.Student.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPeople() {
        return personRepository.findAll();
    }

    public void addPerson(Person person) {
        personRepository.save(person);
    }

    public Optional<Person> getSpecificPerson(UUID id) {
        return personRepository.findById(id);
    }

    public void updatePerson(UUID id, Person person) {
        boolean exists = personRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException(("this person dont exist"));
        }

        Person personD = personRepository.findById(id).get();
        personD.setValue(person.getValue());
        personRepository.save(personD);
    }

    public void delete_person(UUID id) {
        boolean exists = personRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException(("this person dont exist"));
        }
        personRepository.deleteById(id);

    }
}
