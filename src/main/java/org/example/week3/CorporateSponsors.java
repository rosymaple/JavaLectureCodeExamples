package org.example.week3;

import java.util.Arrays;

public class CorporateSponsors {

    public static void main(String[] args) {

        // modify array, make strings uppercase
        String[] sponsors = { "ikea", "at&t", "cvs", "3m"};     // sponsers array is filled with string values

        for (int i = 0; i < sponsors.length; i++) {         // "i" will repeat itself until the end of length of array
            String sponsor = sponsors[i];       // gives the array a variable to declare it within the method
            sponsor = sponsor.toUpperCase();        // this will force the array to print in uppercase
            sponsors[i] = sponsor;      // this will force the "sponsor" variable to loop through the entire array
        }

        System.out.println(Arrays.toString(sponsors));      // this prints the array of company sponsers, in uppercase

    }       // end of main method
}       // end of public class