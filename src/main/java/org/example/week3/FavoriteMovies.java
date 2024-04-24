package org.example.week3;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class FavoriteMovies {
    public static void main(String[] args) {
        String[] topThreeMovies = new String[3]; // create empty array
        getThreeFavoriteMovies(topThreeMovies); // pass the empty array to another method

        // getThreeFavoriteMovies modifies the array with 3 elements...this prints the names the user entered
        // prints array values inside of brackets in a single row of output.
        System.out.println("Your top three favorite movies are " + Arrays.toString(topThreeMovies));
    }       // end of main method
    private static void getThreeFavoriteMovies(String[] movies) {       // public static void method with array argument
        for (int x = 0 ; x < 3; x++) {      // loop counter from 0-3 -- 3 favorite movies
            String favoriteMovie = stringInput("Please enter one of your favorite movies");
            movies[x] = favoriteMovie;      // our movies array will be filled with favoriteMovie string from user input
        }       // end of for loop from 0-3, the parameters of our movies array is only 3.
    }       // end of public static void method
}       // end of public class