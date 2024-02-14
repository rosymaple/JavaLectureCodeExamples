package org.example.week1_if_statements;

import static input.InputUtils.stringInput;

public class CompareStrings {
    public static void main(String[] args) {


        String college = stringInput("What college do you attend? ");

        if (college.equalsIgnoreCase("MCTC")) {
            System.out.println("Yay, MCTC!");


        } else {
            System.out.println("Too bad, you should check out MCTC.");
        }



    }
}
