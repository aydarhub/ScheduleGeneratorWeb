package com.aydar;

public class Audience {

    private int id;
    private String number;

    public Audience(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }
}
