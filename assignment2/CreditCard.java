package de.vogella.jpa.eclipselink.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    private int number;
    private int balance;
    private int limit;

    @OneToOne
    private Pincode pincode = new Pincode();

    @ManyToOne
    private Bank bank = new Bank();

    public int getNumber() { return number; }

    public void setNumber(int number) { this.number = number; }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @ManyToOne
    public Bank getBank() { return bank; }

    public void setBank(Bank bank) { this.bank = bank; }

    @OneToOne
    public Pincode getPincode() { return pincode; }

    public void setPincode(Pincode pincode) { this.pincode = pincode; }

}