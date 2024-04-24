package org.example.week1_if_statements;

import static input.InputUtils.stringInput;

public class Dinner {
    public static void main(String[] args) {

        String dinnerSuggestion = stringInput("What should we have for dinner?");
        // string input for our user
        // Computers only like pizza and tacos.
        // So, print one response for pizza,
        // a different response for tacos,
        // and another response for anything else.

        if (dinnerSuggestion.equalsIgnoreCase("pizza")) {
            // if our user enters pizza and this will accept upper & lowercase answer
            System.out.println("Pizza sounds good!");       // prints message for user
        } else if (dinnerSuggestion.equalsIgnoreCase("tacos")) {
            // else-if asks for another else statement, we will have at least 2 else statements now.
            System.out.println("Great! I like tacos");      // prints if user enters "tacos" case-insensitive.
        } else {        // our last else statement in our if-else loop
            System.out.println("How about pizza, or tacos?");       // prints a message for user
        }       // end of if else loop with two else statements
    }       // end of static void method
}       // end of public class
