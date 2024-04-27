package com.example.sixthlesson_m4;

import java.io.Serializable;

public class Ticket implements Serializable {
    private int ID;
    private int numPlace;
    private String date;
    private int cost;

    public Ticket(int ID, int numPlace, String date, int cost) {
        this.ID = ID;
        this.numPlace = numPlace;
        this.date = date;
        this.cost = cost;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumPlace() {
        return numPlace;
    }

    public void setNumPlace(int numPlace) {
        this.numPlace = numPlace;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }



}
