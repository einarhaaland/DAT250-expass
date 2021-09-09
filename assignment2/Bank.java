package de.vogella.jpa.eclipselink.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
    @Id
    private String name;
    private int pincode;

    private List<CreditCard> cardList = new ArrayList<CreditCard>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany
    public List<CreditCard> getCardList() {
        return cardList;
    }

    public void setCardList(List<CreditCard> cardList) {
        this.cardList = cardList;
    }

}