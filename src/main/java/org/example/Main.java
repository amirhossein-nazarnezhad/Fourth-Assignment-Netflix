package org.example;

import java.util.Scanner;

public class Main {
    //don't limit yourself to our template ***

    static NetflixService netflixService = new NetflixService();




    //===================================================================
    public static void main(String[] args)
    {

        runMenu();

    }

    //=================================================================

    public static void runMenu()
    {
        System.out.println("      NETFLIX     ");
        System.out.println();
        System.out.println("Welcome To NETFLIX ");
        System.out.println("Do you want sign up or log in?");
        System.out.println("1- sign up ");
        System.out.println("2- log in ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number == 1)
        {
            signUp();
        }

        else if(number == 2)
        {
            logIn();
        }

        else
        {
            System.out.println("please enter valid input");
            runMenu();
        }

    }
    //==================================================================================
    public static void signUp()
    {
        Scanner input = new Scanner(System.in);

//        NetflixService signUpService = new NetflixService();    //object of netflix service

        System.out.println("Please enter username");
        String username = input.nextLine();

        if(netflixService.doesUserExist(username))
        {
            System.out.println("This username does exist please enter another username");
            signUp();
        }

        System.out.println("please enter your password");
        String password = input.nextLine();


        System.out.println("please confirm your password");
        String confirmPassword = input.nextLine();

        if(confirmPassword.equalsIgnoreCase(password))
        {
            System.out.println("welcome to NETFLIX " + username);
            User user = new User(username , password);
            netflixService.createAccount(user);
            userMenu();
        }
        else
        {
            System.out.println("Please confirm your password correctly");
            signUp();
        }


    }

    //===========================================================================================

    public static void getUser()
    {

    }

    //=============================================================================================

    public static void logIn()
    {
        Scanner input = new Scanner(System.in);

//        NetflixService logInService = new NetflixService();  // object of netflix service

        System.out.println("Please enter username");
        String username = input.nextLine();
        if(!netflixService.doesUserExist(username))
        {
            System.out.println("This username does not exist please enter valid username");
            System.out.println("Do you want to try again or log out?");
            System.out.println("1- log in");
            System.out.println("2 -log out");
             int n = input.nextInt();

             if(n == 1)
             {
                 logIn();
             }

             else if(n == 2)
             {
                 System.out.println("You have successfully logged out of your account");
                 runMenu();
             }

             else
             {
                 System.out.println("you are entered invalid input So try again to log in ");
                 logIn();
             }

        }

        else
        {

            System.out.println("please enter your password");
            String password = input.nextLine();

            if(!netflixService.doesPasswordCorrect(username , password))
            {
                System.out.println("The password entered is incorrect please try again");
                logIn();
            }

            else
            {
                System.out.println("welcome " + username);
                userMenu();
            }

        }


    }

    //==============================================================================================


    public static void userMenu()
    {

        System.out.println("Please select one of the options below");
        System.out.println("1- search");
        System.out.println("2- add");
        System.out.println("3- favorites menu");
        System.out.println("4- getRecommendations");
        System.out.println("5- log out");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number == 1)
        {
            searchMenu();
        }

        else if(number == 2)
        {
            addMenu();
        }

        else if(number == 3)
        {
            favoriteMenu();
        }

        else if(number == 4)
        {
            recommendationMenu();
        }

        else if(number == 5)
        {
            runMenu();
        }

        else
        {
            System.out.println("please try again and enter valid input");
            userMenu();
        }
    }

    public static void searchMenu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select one of the options below");
        System.out.println("1- search to all film");
        System.out.println("2- search to your favorite film");
        System.out.println("3- log out");

        int number = input.nextInt();

        if(number == 1)
        {

            // all film

                System.out.println("do you want search to tvShow or Movie?");
                System.out.println("1- Movie");
                System.out.println("2- tvShow");
                System.out.println("3- log out");

                int number1 = input.nextInt();

                if(number1 == 1)
                {

                        System.out.println("1- searchByTitle");
                        System.out.println("2- searchByGenre");
                        System.out.println("3- searchByReleaseYear");
                        System.out.println("4- log out");
                        int number2 = input.nextInt();

                        if (number2 == 1)
                        {
                            System.out.println("Please enter the desired title");
                            String title = input.next();
                            System.out.println(netflixService.searchByTitleForMovie(title));//--[]
                        }

                        else if(number2 == 2)
                        {
                            System.out.println("Please enter the desired Genre");
                            String Genre = input.next();
                            System.out.println(netflixService.searchByGenreForMovie(Genre));//--[]
                        }

                        else if(number2 == 3)
                        {
                            System.out.println("Please enter the desired ReleaseYear");
                            int year = input.nextInt();
                            System.out.println(netflixService.searchByReleaseYearForMovie(year));//--[]
                        }

                        else if(number2 == 4)
                        {
                            System.out.println("You have successfully logged out of your account");
                            runMenu();
                        }

                        else
                        {
                            System.out.println("please try again and enter valid input ");
                            searchMenu();
                        }

                }

                else if(number1 == 2)
                {
                        System.out.println("1- searchByTitle");
                        System.out.println("2- searchByGenre");
                        System.out.println("3- searchByReleaseYear");
                        System.out.println("4- log out");
                        int number2 = input.nextInt();

                        if (number2 == 1)
                        {
                            System.out.println("Please enter the desired title");
                            String title = input.next();
                            System.out.println(netflixService.searchByTitleForTvShow(title));//--[]
                        }

                        else if(number2 == 2)
                        {
                            System.out.println("Please enter the desired Genre");
                            String Genre = input.next();
                            System.out.println(netflixService.searchByGenreForTvShow(Genre));//--[]
                        }

                        else if(number2 == 3)
                        {
                            System.out.println("Please enter the desired ReleaseYear");
                            int year = input.nextInt();
                            System.out.println(netflixService.searchByReleaseYearForTvShow(year));//--[]
                        }

                        else if(number2 == 4)
                        {
                            System.out.println("You have successfully logged out of your account");
                            runMenu();
                        }

                        else
                        {
                            System.out.println("please try again and enter valid input ");
                            searchMenu();
                        }
                }

                else if(number1 == 3)
                {
                    runMenu();
                }

                else
                {
                    System.out.println("please try again and enter valid input");
                    searchMenu();
                }
        }

        else if( number == 2)
        {
//--------------------------------------------------------------esm tabe ha bayad avaz beshe

//favorites

            System.out.println("do you want search to tvShow or Movie?");
            System.out.println("1- Movie");
            System.out.println("2- tvShow");
            System.out.println("3- log out");

            int number1 = input.nextInt();

            if(number1 == 1)
            {

                System.out.println("1- searchByTitle");
                System.out.println("2- searchByGenre");
                System.out.println("3- searchByReleaseYear");
                System.out.println("4- log out");
                int number2 = input.nextInt();

                if (number2 == 1)
                {
                    System.out.println("Please enter the desired title");
                    String title = input.next();
                    netflixService.searchByTitleForMovie(title);///./././././././././
                }

                else if(number2 == 2)
                {
                    System.out.println("Please enter the desired Genre");
                    String Genre = input.next();
                    netflixService.searchByGenreForMovie(Genre);///././././././
                }

                else if(number2 == 3)
                {
                    System.out.println("Please enter the desired ReleaseYear");
                    int year = input.nextInt();
                    netflixService.searchByReleaseYearForMovie(year);//././././././
                }

                else if(number2 == 4)
                {
                    System.out.println("You have successfully logged out of your account");
                    runMenu();
                }

                else
                {
                    System.out.println("please try again and enter valid input ");
                    searchMenu();
                }

            }

            else if(number1 == 2)
            {
                System.out.println("1- searchByTitle");
                System.out.println("2- searchByGenre");
                System.out.println("3- searchByReleaseYear");
                System.out.println("4- log out");
                int number2 = input.nextInt();

                if (number2 == 1)
                {
                    System.out.println("Please enter the desired title");
                    String title = input.next();
                    netflixService.searchByTitleForTvShow(title);//.//./././.
                }

                else if(number2 == 2)
                {
                    System.out.println("Please enter the desired Genre");
                    String Genre = input.next();
                    netflixService.searchByGenreForTvShow(Genre);///./././././
                }

                else if(number2 == 3)
                {
                    System.out.println("Please enter the desired ReleaseYear");
                    int year = input.nextInt();
                    netflixService.searchByReleaseYearForTvShow(year);//./././././
                }

                else if(number2 == 4)
                {
                    System.out.println("You have successfully logged out of your account");
                    runMenu();
                }

                else
                {
                    System.out.println("please try again and enter valid input ");
                    searchMenu();
                }

            }

            else if(number1 == 3)
            {
                System.out.println("You have successfully logged out of your account");
                runMenu();
            }

            else
            {
                System.out.println("please try again and enter valid input");
                searchMenu();
            }



        }

        else if( number == 3)
        {
            System.out.println("You have successfully logged out of your account");
            runMenu();
        }

        else
        {
            System.out.println("please try again and enter valid input");
            searchMenu();
        }




    }

    public static void addMenu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select one of the options below");
        System.out.println("1- add tvShow");
        System.out.println("2- add Movie");
        System.out.println("3- log out");

        int number2 = input.nextInt();

        if(number2 == 1)
        {
            System.out.println("please enter title of tvShow");
            String title = input.next();

            System.out.println("please enter genre of tvShow");
            String genre = input.next();

            System.out.println("please enter year of tvShow");
            int year = input.nextInt();

            System.out.println("please enter duration of tvShow");
            String duration = input.next();

            System.out.println("please enter rating of tvShow   1-10");
            int rating = input.nextInt();

            TVShow tvShow = new TVShow(title , genre , year , duration , rating);

            netflixService.addTVShow(tvShow);
        }

        else if (number2 == 2)
        {
            System.out.println("please enter title of Movie");
            String title = input.next();

            System.out.println("please enter genre of Movie");
            String genre = input.next();

            System.out.println("please enter year of Movie");
            int year = input.nextInt();

            System.out.println("please enter length of Movie");
            String length = input.next();

            //--------------------------------------------------

            String duration= "jdcjn";

            //---------------------------------------------------
            System.out.println("please enter rating of Movie  1-10");
            int rating = input.nextInt();

            Movie movie = new Movie(title , genre , year , duration  , rating , length);

            netflixService.addMovie(movie);
        }

        else if(number2 == 3)
        {
            System.out.println("You have successfully logged out of your account");
            runMenu();
        }
        else
        {
            System.out.println("please try again and enter valid input ");
            addMenu();
        }
    }

    public static void favoriteMenu()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please select one of the options below");
        System.out.println("1- Movies");
        System.out.println("2- tv shows");
        System.out.println("3- log out");

        int number = input.nextInt();



        if(number == 1)
        {

            System.out.println("1- view favorite");
            System.out.println("2- log out");
            int number3 = input.nextInt();

            if(number3 == 1)
            {

            }


            else if(number3 == 2)
            {
                System.out.println("You have successfully logged out of your account");
                runMenu();
            }

            else
            {
                System.out.println("please try again and enter valid input");
                favoriteMenu();
            }

        }

        else if(number == 2)
        {

            System.out.println("1- view favorite");
            System.out.println("2- log out");
            int number3 = input.nextInt();

            if(number3 == 1)
            {
//                User user ;
//                user.viewTvShowFavorites();  //-----=-=-=-=-=-========--==-=-= last =-=-=-=-==-=-=-=-===--=
            }

            else if(number3 == 2)
            {
                System.out.println("You have successfully logged out of your account");
                runMenu();
            }

            else
            {
                System.out.println("please try again and enter valid input");
                favoriteMenu();
            }

        }

        else if( number == 3)
        {
            System.out.println("You have successfully logged out of your account");
            runMenu();
        }

        else
        {
            System.out.println("please try again and enter valid input");
            favoriteMenu();
        }





    }

    public static void recommendationMenu()
    {

    }
}
