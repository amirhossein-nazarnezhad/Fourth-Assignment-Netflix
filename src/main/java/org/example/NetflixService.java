package org.example;

import java.util.ArrayList;

class NetflixService {
    /*
     *The NetflixService should have an Arraylist of users, tv shows and movies.
     *The NetflixService should have a User object which represents current user.
     */

    
//========================================================================

    //arraylists
    ArrayList <User> users = new ArrayList<User>();
    ArrayList <TVShow> tvShows = new ArrayList<TVShow>();
    ArrayList <Movie> movies = new ArrayList<Movie>();

    //====================================================================================
    public void addTVShow(TVShow tvShow)
    {
        // Implement add tv show logic here

        tvShows.add(tvShow);
    }

    public void addMovie(Movie movie)
    {
        // Implement add movie logic here
        movies.add(movie);
    }

    public void createAccount(String username, String password)
    {
        // Implement create account logic here

        User user = new User(username , password);
        users.add(user);
        System.out.println("Your account has been successfully created");

    }

//    public boolean login(String username, String password) {
//        // Implement login logic here
//        return false;
//    }

//    public void logout() {
//        // Implement logout logic here
//    }

    public boolean doesUserExist(String username)
    {
        for (User i : users)
        {
            if( i.getUsername().contains(username))
            {
                return true;
            }

        }
        return false;
    }

    public boolean doesPasswordCorrect(String username , String password)
    {
        for (User i : users)
        {
            if( i.getUsername().contains(username) && i.getPassword().equals(password) )
            {
                return true;
            }

        }
        return false;
    }

    public ArrayList<TVShow> searchByTitle(String title) {
        // Implement search by title logic here
        return null;
    }

    public ArrayList<TVShow> searchByGenre(String genre) {
        // Implement search by genre logic here
        return null;
    }

    public ArrayList<TVShow> searchByReleaseYear(int year) {
        // Implement search by release year logic here
        return null;
    }




}

