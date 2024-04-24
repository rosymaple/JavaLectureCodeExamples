package org.example.week3;

import static input.InputUtils.doubleInput;

public class Squares {

    //This is the main method - the first code to run
    public static void main(String[] args) {        // calls the main string method

        double number = doubleInput("Please enter a number and I'll square it.");       // user input
        square(number);     // this will square the user input "number" variable above
    }       // End of main method.

    //This method takes one argument, a number
    //It calculates the square of that number by multiplying it by itself
    //and prints the number and its square value
    public static void square(double n) {       // this void method will not return anything
        double sq = n * n; // The square of a number is that number multiplied by itself
        System.out.println("The square of " + n + " is " + sq); // a line of strings and variables
    }       // End of the square method.
} // end of the squares class
