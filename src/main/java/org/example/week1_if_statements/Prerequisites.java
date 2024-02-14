package org.example.week1_if_statements;

import static input.InputUtils.yesNoInput;

public class Prerequisites {
    public static void main(String[] args) {

        boolean hasTakenITConcepts = yesNoInput("Have you taken ITEC 1100 Info Tech Concepts?");
        boolean hasTakenITSkills = yesNoInput("Have you taken ITEC 1110 Info Skills?");
        boolean hasTakenWindows = yesNoInput("Have you taken ITEC 1250 Windows Operating Systems?");

        // Use an AND operator in the condition to check if all of the pre-reqs are met.
        if (hasTakenITConcepts && hasTakenITSkills && hasTakenWindows){
            System.out.println("You meet the pre-requisites.");
        } else {
            System.out.println("You do not meet the pre-requisites.");}
    }
}
