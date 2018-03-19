package com.example.domains;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person {


    @Id
    @GeneratedValue
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private String address;
    @Column
    private int numberHome;
    @Column
    private String firstName;
    @Column
    private String nationality;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Person(Long id, String name, int age, String address, int numberHome, String firstName, String nationality) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.numberHome = numberHome;
        this.firstName = firstName;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberHome() {
        return numberHome;
    }

    public void setNumberHome(int numberHome) {
        this.numberHome = numberHome;
    }
}
