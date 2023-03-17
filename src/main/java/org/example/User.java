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

    static ArrayList <TVShow> favoriteTvShow = new ArrayList<TVShow>();
    static ArrayList <Movie> favoriteMovie = new ArrayList<Movie>();

    //=========================================================================

    //searcher


    //tv show
    public static ArrayList<TVShow> searchByTitleForTvShow(String title)
    {
        // Implement search by title in favorite shows  logic here

        ArrayList <TVShow> showFavoriteTvShow = new ArrayList<TVShow>();

        for (TVShow i : favoriteTvShow)
        {
            if( i.getTitle().contains(title))
            {
                showFavoriteTvShow.add(i);
            }
        }

        return showFavoriteTvShow;

    }
    public static ArrayList<TVShow> searchByGenreForTvShow(String genre)
    {
        // Implement search by genre in favorite shows  logic here
        ArrayList <TVShow> showFavoriteTvShow = new ArrayList<TVShow>();

        for (TVShow i : favoriteTvShow)
        {
            if( i.getGenre().contains(genre))
            {
                showFavoriteTvShow.add(i);
            }
        }

        return showFavoriteTvShow;

    }



    public static ArrayList<TVShow> searchByReleaseYearForTvShow(int year)
    {
        // Implement search by release year in favorite shows logic here
        ArrayList <TVShow> showFavoriteTvShow = new ArrayList<TVShow>();

        for (TVShow i : favoriteTvShow)
        {
            if( i.getYear() == year)
            {
                showFavoriteTvShow.add(i);
            }
        }

        return showFavoriteTvShow;

    }



//--------------------------------------------------------------------------------------------------

//movie

    public static ArrayList<Movie> searchByTitleForMovie(String title)
    {
        // Implement search by title in favorite shows  logic here
        ArrayList <Movie> showFavoriteMovie = new ArrayList<Movie>();

        for (Movie i : favoriteMovie)
        {
            if( i.getTitle().contains(title))
            {
               showFavoriteMovie.add(i);
            }
        }
        
        return showFavoriteMovie;
        
        
    }
    public static ArrayList<Movie> searchByGenreForMovie(String genre)
    {
        // Implement search by genre in favorite shows  logic here
        ArrayList <Movie> showFavoriteMovie = new ArrayList<Movie>();

        for (Movie i : favoriteMovie)
        {
            if( i.getGenre().contains(genre))
            {
                showFavoriteMovie.add(i);
            }
        }

        return showFavoriteMovie;

    }

    public static ArrayList<Movie> searchByReleaseYearForMovie(int year)
    {
        // Implement search by release year in favorite shows logic here
        ArrayList <Movie> showFavoriteMovie = new ArrayList<Movie>();

        for (Movie i : favoriteMovie)
        {
            if( i.getYear() == year)
            {
                showFavoriteMovie.add(i);
            }
        }

        return showFavoriteMovie;

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

    public void addToTvShowFavorites(TVShow tvShow)
    {
        favoriteTvShow.add(tvShow);
    }
    public static ArrayList<TVShow> viewTvShowFavorites()
    {
        return favoriteTvShow;
    }


    public void addToMovieFavorites(Movie movie)
    {
        favoriteMovie.add(movie);
    }
    public static ArrayList<Movie> viewMovieFavorites()
    {
        return favoriteMovie;
    }

    //========================================================================================
    
    //recommendation
    public ArrayList<TVShow> getTvShowRecommendations()
    {
        // Implement get recommendations logic here
        return null;
    }

    public ArrayList<Movie> getMovieRecommendations()
    {
        // Implement get recommendations logic here
        return null;
    }
    
    //==========================================================================================



}
