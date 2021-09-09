package de.vogella.jpa.eclipselink.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String street;
    private int number;
    private List<Person> personList = new ArrayList<Person>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @ManyToMany
    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

}