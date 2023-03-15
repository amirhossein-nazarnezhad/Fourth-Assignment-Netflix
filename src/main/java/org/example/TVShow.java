package org.example;

import java.util.ArrayList;

class TVShow
{
    /*
    *The TVShow should have a title , genre, release year, duration and a rating.
     *The TVShow should have an ArrayList of the cast.
     */

    private String title;
    private String genre;
    private int year;
    private String duration;  //modat zaman
    private int rating;

    //=====================================================================
    // constructor

    public TVShow(String title, String genre, int year, String duration, int rating)
    {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.duration = duration;
        this.rating = rating;
    }

    //=========================================================================

    //getter and setter
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String getDuration()
    {
        return duration;
    }

    public void setDuration(String duration)
    {
        this.duration = duration;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }
}
