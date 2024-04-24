package org.example.week3;

import static input.InputUtils.doubleInput;

public class Squares2 {
    //This is the main method - the first code to run
    public static void main(String[] args) {

//        double number = doubleInput("Please enter a number and I'll square it.");   // user input for "number"
//        double squared = square(number);      // the double type variable for squaredNumber (user input squared)
//        System.out.println("The square of " + number + " is " + squared);

        for (int x=1; x <= 10; x++) {       // loop through the numbers 1-10
            double s = square(x);       // the square method defined below will be performed on variable "x"
            System.out.println("the square of " + x + " is " + s);  //prints message with new squared variable "s"
        }       // end of for loop
    }       // End of main method.


    // This method takes one argument, a number
    // It calculates the square of that number (by multiplying it by itself)
    // and then returns the square value.
    private static double square(double n) {        // creating a double type of method
        double sq = n * n;      // The square of a number is that number multiplied by itself.
        return sq;      // this returns the squared number
    }       // end of square method
}       // end of public class
