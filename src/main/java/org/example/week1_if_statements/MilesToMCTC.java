package org.example.week1_if_statements;

public class MilesToMCTC {
    public static void main(String[] args) {
        double miles = positiveDoubleInput("How many miles from your house to MCTC?");
        double km = miles * 1.6;
        System.out.println("You live " + km + "kilometers from school " );
    }
}
