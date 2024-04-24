package org.example.week1_if_statements;

import static input.InputUtils.doubleInput;
public class AboveFreezingElse {

    public static void main(String[] args) {        // start of main method
        double temp = doubleInput("Enter today's temperature: ");   // our "temp" variable
        // we wil use doubleInput for our "temp"-erature value since it is a 2-digit number
        //Indentation in if blocks is optional but recommended.

        if (temp > 32) {        // start of if-else loop
            //This will run if the condition is true
            System.out.println("It's above freezing");      // prints message for user
        } else {        // if the "temp" is NOT greater than 32
            System.out.println("It's below freezing");      // print message for user
        }       // end of if-else loop
    }       // end of main method
}       // end of public class AboveFreezingElse
