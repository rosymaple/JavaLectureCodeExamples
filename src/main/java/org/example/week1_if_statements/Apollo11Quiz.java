package org.example.week1_if_statements;

import static input.InputUtils.intInput;
public class Apollo11Quiz {
    public static void main(String[] args) {

        System.out.println("Quiz time!");       // prints message for user
        System.out.println("What year did the Apollo spaceship land on the moon? ");        // prints question for user

        // the answer is 1969

        int answer = intInput();        // initialize our answer variable, we will take an "int" for our input

        // The != operator tests if two values are not equal
        // This condition tests if answer is not equal to 1969.
        if ( answer != 1969 ) {     // if the user does NOT enter 1969
            System.out.println("Wrong answer - it was 1969.");      // print this message for user
        }       // end of if statement
    }       // end of main method
}       // end of public class
