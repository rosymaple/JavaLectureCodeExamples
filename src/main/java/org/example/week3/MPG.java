package org.example.week3;

import static input.InputUtils.doubleInput;

public class MPG {
    public static void main(String[] args) {        // start of main method
        double miles = doubleInput("Enter number of miles driven:");    // miles = user input
        double gas = doubleInput("Enter gallons of gas used: ");        // gas = user input

        double mpg = milesPerGallon(miles, gas);        // the method below will calculate this equation milesPerGallon
        System.out.println("The MPG for this journey is " + mpg + " miles per gallon.");        // prints the results.
    }       // end of main method

    public static double milesPerGallon(double miles, double gallonsOfGas) {  // this method calculates milesPerGallon
        double mpg = miles / gallonsOfGas;      // mpg is the milesPerGallon equation results
        return mpg;     // returns the equation results back to the main method
    }       // end of milesPerGallon message
}       // end of public class MPG
