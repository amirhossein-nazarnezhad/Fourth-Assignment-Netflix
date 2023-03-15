package org.example;

import java.util.ArrayList;

class Movie extends TVShow {
    /*
     *Movie is extended from TVShow and has extra attribute length.
     */

    private String length;


//=======================================================

    //getter and setter
    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    //==========================================================

    //constructor

    public Movie(String title, String genre, int year, String duration, int rating, String length) {
        super(title, genre, year, duration, rating);
        this.length = length;
    }

    //=============================================================
}
