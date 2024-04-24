package org.example.week3;

import java.util.Arrays;

public class makeArrayUppercase {       // start of public class method
    public static void main(String[] args) {        // calling a string method
        String[] sponsors = { "ikea", "arnt", "cvs", "3m"};     // example string array
        makeArrayUppercase(sponsors);       // calls the makeArrayUppercase method
        System.out.println(Arrays.toString(sponsors));      //prints the sponsors array as a string
    }       // end of void string method

    private static void makeArrayUppercase(String[] array) {        // void method for making any array uppercase
        for (int x = 0 ; x < array.length; x++) {       // looping over the length of the array until completed
            array[x] = array[x].toUpperCase();      // changes any array elements to uppercase letters if using method
        }       // end of loop block
    }       // end of makeArrayUppercase method
}       // end of public class method
