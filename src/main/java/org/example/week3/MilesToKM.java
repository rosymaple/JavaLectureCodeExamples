package org.example.week3;

import static input.InputUtils.doubleInput;

public class MilesToKM {
    public static void main(String[] args) {        // start of public static method
        double miles = doubleInput("Enter a number of miles");      // miles will be input from the user
        double km = milesToKm(miles);       // km will be a calculation using milesToKm method
        System.out.println(miles + " miles is equal to " + km + " kilometers.");        // print a message for the user
    }       // end of public main method

    private static double milesToKm(double miles) {     // milesToKm method with one argument, "miles"
        // start of private static method "milestoKm" with "miles" argument
        double km = miles * 1.6;        // km variable is "miles" input multiplied by 1.6
        return km;      // return km variable to main method
    }       // end of milesToKm
}       // public class