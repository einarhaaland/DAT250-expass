package de.vogella.jpa.eclipselink.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pincode {
    @Id
    private int id;
    private int pincode;

    public int getId() {
        return id;
    }

    public void setId(int number) {
        this.id = number;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

}