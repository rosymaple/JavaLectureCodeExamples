package org.example.week1_if_statements;

import static input.InputUtils.*;

public class HelloInput {
    public static void main(String[] args) {

        // we will accept a string input from our user below for our "name" variable...
        String name = stringInput("Please enter your name");        // user enters "name" variable
        System.out.println("Hello " + name + "! ");     // prints hello message for user using string input variable

        int numberOfClasses = positiveIntInput("How many classes do you have this semester?");
        // we need a positive Int number for our input above. asks user for numberOfClasses.

        String units = "classes ";      // initializes our "units" variable which will be "classes"

        if (numberOfClasses == 1) {     // if user enters only 1 class in "numberOfClasses" variable
            units = "class ";       // print "class" instead of "classes"...
            // unit will represent plural or non plural variable.
        }       // end of if statement

        System.out.println("You are taking " + numberOfClasses + " " + units + " this semester. ");
        // prints a message for our user using numberOfClasses and units variables
        System.out.printf("You are taking %d %s this semester.", numberOfClasses, units);
        // this prints the same message for our user but in a format string instead
    }       // end of main method
}       // end of public class
