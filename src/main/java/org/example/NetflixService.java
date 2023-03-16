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

    public void createAccount(User user)
    {
        // Implement create account logic here


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

    //===========================================================================

    //search

    public ArrayList<TVShow> searchByTitleForTvShow(String title) {
        // Implement search by title logic here
        ArrayList <TVShow> showTvShow = new ArrayList<TVShow>();

        for (TVShow i : tvShows)
        {
            if( i.getTitle().contains(title))
            {
                showTvShow.add(i);
            }
        }

        return showTvShow;

    }

    public ArrayList<TVShow> searchByGenreForTvShow(String genre)
    {
        ArrayList <TVShow> showTvShow = new ArrayList<TVShow>();

        for (TVShow i : tvShows)
        {
            if( i.getGenre().contains(genre))
            {
                showTvShow.add(i);
            }
        }

        return showTvShow;
    }

    public ArrayList<TVShow> searchByReleaseYearForTvShow(int year)
    {
        ArrayList <TVShow> showTvShow = new ArrayList<TVShow>();

        for (TVShow i : tvShows)
        {
            if( i.getYear() == year)
            {
                showTvShow.add(i);
            }
        }

        return showTvShow;
    }


//------------------------------------------------------------------------------
    public ArrayList<Movie> searchByTitleForMovie(String title) {
        // Implement search by title logic here
        ArrayList <Movie> showMovie = new ArrayList<Movie>();

        for (Movie i : movies)
        {
            if( i.getTitle().contains(title))
            {
                showMovie.add(i);
            }
        }

        return showMovie;

    }

    public ArrayList<Movie> searchByGenreForMovie(String genre)
    {
        ArrayList <Movie> showMovie = new ArrayList<Movie>();

        for (Movie i : movies)
        {
            if( i.getGenre().contains(genre))
            {
                showMovie.add(i);
            }
        }

        return showMovie;
    }

    public ArrayList<Movie> searchByReleaseYearForMovie(int year)
    {
        ArrayList <Movie> showMovie = new ArrayList<Movie>();

        for (Movie i : movies)
        {
            if( i.getYear() == year)
            {
                showMovie.add(i);
            }
        }

        return showMovie;
    }






}

