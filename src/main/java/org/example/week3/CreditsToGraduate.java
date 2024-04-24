package org.example.week3;

import static input.InputUtils.intInput;

public class CreditsToGraduate {
    public static void main(String[] args) {        // the main string method
        int required = intInput("How many credits does your program require?");     // user input
        int earned = intInput("How many credits have you earned?");     // user input
        int needed = howManyCreditsToGraduate(required, earned);      //calling the int method howManyCreditsToGraduate
        System.out.println("You need " + needed + " credits.");     // printing the result for the user
    }       // end of main method

    public static int howManyCreditsToGraduate(int creditsNeeded, int creditsEarned) {      //calling an int method
        int creditsToGraduate = creditsNeeded - creditsEarned;      // the equation to calculate creditsToGraduate
        return creditsToGraduate;       // this returns the equation answer to the main method
    }       // end of method howManyCreditsToGraduate
}       // end of public class CreditsToGraduate
