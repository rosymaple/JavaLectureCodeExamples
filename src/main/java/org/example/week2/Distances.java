package org.example.week2;

public class Distances {
    public static void main(String[] args) {        // start of main method

        // Start with a list of distances in miles
        // Create a new array with the corresponding distances in kilometers
        double[] miles = { 1, 4, 10 };      // start of "miles" array
        double[] kilometers = new double[miles.length];     // "kilometers" will be an array as well.
        // the kilometers array will be the same length of miles array. each element will be 0.

        for (int x = 0 ; x < miles.length ; x++) {      // for loop counter over the length of miles array...
            double km = miles[x] * 1.6;     // perform an equation on each element in the "miles" array...
            kilometers[x] = km;     // we will fill in the kilometers array using a for loop and an equation on miles.
        }       // end of for loop counter

        for (int x = 0 ; x < miles.length; x++) {       // for loop counter over length of miles array...
            System.out.println(miles[x] + " miles is equal to " + kilometers[x] + " kilometers");
            // print a message for user using elements from the miles and kilometers array.
        }       // end of for loop counter
    }       // end of main method
}       // end of public class
