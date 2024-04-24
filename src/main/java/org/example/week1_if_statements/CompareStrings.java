package org.example.week1_if_statements;

import static input.InputUtils.stringInput;

public class CompareStrings {
    public static void main(String[] args) {

        // we need string input from our user to ask what college do they attend
        String college = stringInput("What college do you attend? ");
        // start of our if-else statement below...
        if (college.equalsIgnoreCase("MCTC")) {     //.equalsIgnoreCase will ignore upper/lowercase
            System.out.println("Yay, MCTC!");       // prints message for MCTC student
        } else {    // else, if our user is not an MCTC student
            System.out.println("Too bad, you should check out MCTC.");      // prints message for not-MCTC student
        }       // end of if-else statement
    }       // end of public method
}       // end of public class
