package org.example.week1_if_statements;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class BloodDonor {
    public static void main(String[] args) {

        // Testing if two things are true with AND the logical operator "&&"
        // A person can be a blood donor if
        // they weigh at least 110lbs AND are 17 or over

        System.out.println("What is your weight?");     // prints message for user
        double weight = doubleInput();      // initializes our "double" weight variable using doubleInput

        System.out.println("How old are you?");     // prints message for user
        int age = intInput();       // initializes our "int" age variable using intInput

        if (weight >= 110 && age >= 17) {       // if weight is over 110 and age is over 17
            System.out.println("You are eligible to be a blood donor.");    // prints positive message for user
        } else {        // if-else statement, if they are not over 110 AND age is not over 17
            System.out.println("Sorry, you are not eligible.");     // prints message for user
            if (weight > 110) {     // if weight is under 110
                System.out.println("You do not weigh enough to donate blood.");     // prints message
            }       // end of second if statement in this block of code
            if (age < 17) {     // if age is under 17 ...
                System.out.println("You are not old enough to donate blood.");      // prints message
            }       // end of third if statement in this block of code
        }       // end of if-else block
    }       // end of public main method
}       // end of public class