package org.example.week1_if_statements;

import static input.InputUtils.yesNoInput;

public class Prerequisites {
    public static void main(String[] args) {

        // we will ask for three boolean variables from our user using yesNoInput()...
        boolean hasTakenITConcepts = yesNoInput("Have you taken ITEC 1100 Info Tech Concepts?");
        boolean hasTakenITSkills = yesNoInput("Have you taken ITEC 1110 Info Skills?");
        boolean hasTakenWindows = yesNoInput("Have you taken ITEC 1250 Windows Operating Systems?");

        // Use an AND operator in the condition to check if all of the pre-reqs are met.
        if (hasTakenITConcepts && hasTakenITSkills && hasTakenWindows){
            // if user has taken all three classes...
            System.out.println("You meet the pre-requisites.");     // print positive message for user.
        } else {        // else statement in our if-else statement...
            System.out.println("You do not meet the pre-requisites.");}     // prints negative message for user.
    }       // end of main method.
}       // end of public class.
