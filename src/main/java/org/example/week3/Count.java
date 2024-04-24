package org.example.week3;

import static input.InputUtils.intInput;

public class Count {
    public static void main(String[] args) {        // call the main method for string arguments


        // print a list of numbers in order
        int smallNumber = intInput("Enter a small number");     // ask user for smallest number
        int largeNumber = intInput("Enter a large number");     // ask user for largest number

        System.out.println("I will count from " + smallNumber + " to " + largeNumber);      // print message for user

        count(smallNumber, largeNumber);    // this line will count from one number up to the second number from input
    }       // end of main method

    // methods that don't return anything are return type "public static VOID"
    public static void count(int min, int max) {        // two arguments -- int value min and int value max
        for(int i = min; i <= max ; i++) {      // loop through min variable until you hit the max variable.
            System.out.println(i);      // print each number in loop. min through max.
        }       // end of for loop counter
    }       // end of public void method
}       // end of public class Count
