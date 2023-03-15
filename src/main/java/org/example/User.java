package org.example;

import java.util.ArrayList;

class User {
    /*
    * The user should contain username password.
    * The user should contain an ArrayList of favorite shows and watch history.
    * FUNCTION: the user should have a function to watch a show and add it to watch history.
    *  *** NOTE: All search functions in user are for searching in favorite shows ***
    */


    //=======================================================================================

    private String username;
    private String password;





//=============================================================================
    //constructor
    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

//===============================================================================

    //array lists favorite

    ArrayList <TVShow> favoriteTvShow = new ArrayList<TVShow>();

    //=========================================================================

    //searcher
    public ArrayList<TVShow> searchByTitle(String title)
    {
        // Implement search by title in favorite shows  logic here

        for (TVShow i : favoriteTvShow)
        {
           if( i.getTitle().contains(title))
           {
//               return TVShow;
           }
        }
        return null;
    }
    public ArrayList<TVShow> searchByGenre(String genre)
    {
        // Implement search by genre in favorite shows  logic here
        for (TVShow i : favoriteTvShow)
        {
            if( i.getGenre().contains(genre))
            {
//                return TVShow;
            }
        }
        return null;
    }

    public ArrayList<TVShow> searchByReleaseYear(int year)
    {
        // Implement search by release year in favorite shows logic here
        for (TVShow i : favoriteTvShow)
        {
            if( i.getYear() == year)
            {
//                return TVShow;
            }

        }
        return null;
    }


    //================================================================================

    // getter and setter
    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    //======================================================================================

    //favorites

    public void addToFavorites(TVShow show)
    {
        // Implement add to favorites logic here
    }
    public void viewFavorites()
    {
        // Implement view favorites logic here
    }

    //========================================================================================
    public ArrayList<TVShow> getRecommendations()
    {
        // Implement get recommendations logic here
        return null;
    }


}
