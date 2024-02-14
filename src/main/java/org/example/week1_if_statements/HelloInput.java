package org.example.week1_if_statements;

import static input.InputUtils.*;

public class HelloInput {
    public static void main(String[] args) {

        String name = stringInput("Please enter your name");
        System.out.println("Hello " + name + "! ");

        int numberOfClasses = positiveIntInput("How many classes do you have this semester?");

        String units = "classes ";

        if (numberOfClasses == 1) {
            units = "class ";
        }

        System.out.println("You are taking " + numberOfClasses + " " + units + " this semester. ");
        System.out.printf("You are taking %d %s this semester.", numberOfClasses, units);
    }
}
