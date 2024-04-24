package org.example.week2;

import static input.InputUtils.positiveIntInput;

public class Stars {
    public static void main(String args[]) {
        // Display a square shape of * characters
        int size = positiveIntInput("Enter size of square?");       // ask the user for the size of square

        // The outer loop prints one row per loop repeat
        for (int x = 0 ; x < size ; x++) {      // this loops over the number inputted above into "size"
            // on each row displayed, print a star 5 times
            for (int y = 0 ; y < size; y++) {       // another for loop.print a row for every number in "size" variable.
                //Notice System.out.print - not println. This doesn't add the newline
                //at the end of the output, so all the stars are on the same line.
                System.out.print("*");      // print star character line
            }       // end of loop counter for y variable
            System.out.println();       // print new line
        }       // end of for loop over variable "size"
    }       // end of main method
}       // end of public class
