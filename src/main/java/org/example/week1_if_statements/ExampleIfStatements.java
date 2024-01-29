package org.example.week1_if_statements;

import static input.InputUtils.intInput;

public class ExampleIfStatements {

    public static void main(String[])

        String college = "MCTC";
        String className = "Java";
        int classCode = intInput("Enter a class code: ");

        if (classCode == 2545) {
            System.out.println("This is Java Programming.");
    }   else {
            System.out.println("This is not Java.");
    }





}
