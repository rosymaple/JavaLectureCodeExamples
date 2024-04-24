package org.example.week1_if_statements;

import static input.InputUtils.doubleInput;

public class AboveFreezing {
    public static void main(String[] args) {        // start of main method

        System.out.println("Enter today's temperature in F: ");     // print message for user
        double temp = doubleInput();        //  initialize double temp variable

        if (temp > 32) {        // if conditional statement, if double input "temp" is greater than 32
            // This will run if the condition is true.
            System.out.println("It's above freezing.");
        }       // end of if loop
    }       // end of main method
}       // end of public class
