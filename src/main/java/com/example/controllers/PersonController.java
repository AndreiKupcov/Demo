package com.example.controllers;

import com.example.domains.Person;
import com.example.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping(value = "/")
    public String home() {
        return "Hello";
    }

    @GetMapping("/name")
    public String tot(@RequestParam String name, String firstName, int age) {
        return "Hello " + name + " " + firstName + " " + age;

    }

    @GetMapping("/big")
    public int bigNumber(@RequestParam int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    @GetMapping()
    public String prostoy() {
        return "prostoy";
    }

    @GetMapping("/method/ret/coc")
    public String method(@RequestParam("id") long id, String name) { //localhost:8080/method/ret/coc?23&Andrey
        return "method8 с id =" + id + "и name =" + name;
    }

    @PostMapping(value = "/save")
    public ResponseEntity save(@RequestBody Person person) {
        Person personSaved = personService.save(person);
        return new ResponseEntity(personSaved, HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity findAll() {
        List<Person> personFindAll = personService.findAll();
        return new ResponseEntity(personFindAll, HttpStatus.OK);
    }

    @GetMapping("/findId/{id}")
    public ResponseEntity findId(@PathVariable("id") int id) {
        Optional<Person> personFindId = personService.findId(id);
        return new ResponseEntity(personFindId, HttpStatus.OK);
    }

    @GetMapping("/findIdPar")
    public ResponseEntity personFindIdPar(@RequestParam("id") long id){
        Optional<Person> personFindIdPar = personService.findIdPar(id);
        return new ResponseEntity(personFindIdPar, HttpStatus.OK);

    }
}
