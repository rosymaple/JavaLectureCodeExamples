package org.example.week1_if_statements;

import static input.InputUtils.positiveDoubleInput;

public class MilesToMCTC {
    public static void main(String[] args) {

        // "miles" and "km" will be double variables.
        // "miles" needs to be a positive double number, and we will ask our user for this variable.
        double miles = positiveDoubleInput("How many miles from your house to MCTC?");
        double km = miles * 1.6;        // km will be an equation using our miles variable from the user.
        System.out.println("You live " + km + "kilometers from school " );      // prints a message for user.

    // does the user live more than 10 miles away from the school??

        if (miles > 10) {       // if-else statement with two else statements. if miles is greater than 10...
            System.out.println("You live more than 10 miles away.");        // print message for user
        } else if (miles == 10) {       // else if miles is EQUAL to 10 exactly...
            System.out.println("You live exactly 10 miles away from MCTC.");        // prints specific message for user.
        } else {        // last else statement in loop...
            System.out.println("You live less than 10 miles away.");    // prints message for user.
        }       // end of if-else block
    }       // end of main method
}       // end of public class
