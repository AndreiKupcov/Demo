package com.example.services;

import com.example.domains.Person;
import com.example.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Optional<Person> findId(int id) {
        return personRepository.findById((long) id);
    }

    public Optional<Person> findIdPar(long id) {
        return personRepository.findById(id);

    }
}