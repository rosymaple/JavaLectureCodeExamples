package org.example.week3;

import static input.InputUtils.stringInput;

public class HelloMethods {
    public static void main(String[] args) {

        String name = stringInput("Please enter your name");        // user input
        String greeting = makeGreeting(name);       // declares greeting variable using the makeGreeting method
        System.out.println(greeting);       // prints the makeGreeting output for the user
    }       // This is the end of the main method.

    public static String makeGreeting(String n) {       // declares a string method using a string variable
        String greeting = "Hello " + n + "!";       // uses the declared variable to return string output to the user
        return greeting;        // return or output the message
    }       // end of string method
}       // end of public class HelloMethods
