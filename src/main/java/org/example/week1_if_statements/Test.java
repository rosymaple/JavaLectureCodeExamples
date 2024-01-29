package org.example.week1_if_statements;

import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;

public class Test {
    public static class TestInput {

        //psvm shortcut

        public static void main(String[] args) {

            String name = stringInput("Enter your name: ");
            System.out.println("Hello " + name);

            int number = intInput("Enter a number ");

            // Example citing resources
            int total = 6 + 7;
            // https://www.w3schools.com/java/java_howto_add_two_numbers.asp

        }

    }
}
