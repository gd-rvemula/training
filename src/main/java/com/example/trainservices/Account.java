package com.example.trainservices;

/**
 * Created by rcvemula on 12/23/16.
 * 
 * Comment added by Velsamy 24-Aug-2017
 * 
 */
public class Account {


    String name;
    String number;

    public int getNbrCards() {
        return nbrCards;
    }

    public void setNbrCards(int nbrCards) {
        this.nbrCards = nbrCards;
    }

    int nbrCards;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Account [name=" + name + ", number=" + number + "]";
    }

}
