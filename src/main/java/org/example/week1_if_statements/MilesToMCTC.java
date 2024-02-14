package org.example.week1_if_statements;

import static input.InputUtils.positiveDoubleInput;

public class MilesToMCTC {
    public static void main(String[] args) {
        double miles = positiveDoubleInput("How many miles from your house to MCTC?");
        double km = miles * 1.6;
        System.out.println("You live " + km + "kilometers from school " );

    // does the user live more than 10 miles away from the school??

        if (miles > 10) {
            System.out.println("You live more than 10 miles away.");
        } else if (miles == 10) {
            System.out.println("You live exactly 10 miles away from MCTC.");
        } else {
            System.out.println("You live less than 10 miles away.");

        }

    }
}
