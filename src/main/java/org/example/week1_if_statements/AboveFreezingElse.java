package org.example.week1_if_statements;

import static input.InputUtils.doubleInput;
public class AboveFreezingElse {

    public static void main(String[] args) {
        double temp = doubleInput("Enter today's temperature: ");

        //Indentation in if blocks is optional but strongly suggested.
        //It's a standard convention and helps readability.

        if (temp > 32) {
            //This will run if the condition is true
            System.out.println("It's above freezing");
        } else {
            System.out.println("It's below freezing");
        }
    }
}
