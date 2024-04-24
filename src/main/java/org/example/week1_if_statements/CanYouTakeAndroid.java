package org.example.week1_if_statements;

import static input.InputUtils.yesNoInput;

public class CanYouTakeAndroid {

    public static void main(String[] args) {

        // these two messages will print for the user...
        System.out.println("This program will check if you meet the pre-requisites for taking Android Programming. ");
        System.out.println("Please answer the following two questions.");

        boolean hasTakenCSharp = yesNoInput("Have you taken ITEC 2505 C# Programming?");
        // both variables above & below are boolean true/false variables, yesNoInput will ask user for variable.
        boolean hasTakenJava = yesNoInput("Have you taken ITEC 2545 Java Programming?");

        // Use an OR operator in the condition to check if the pre-requisites are met.

        if (hasTakenCSharp || hasTakenJava) {       // if students has taken C# OR java programming...
            System.out.println("You meet the pre-requisites. You may take Android Programming.");   //print message
        } else {        // if-else statement, if students have not taken either of those classes...
            System.out.println("You do not meet the pre-requisites yet. You need to complete either C# or Java.");
        }       // our "else" statement prints above. this is the end of our if-else statement.
    }       // end of main method
}       // end of public class