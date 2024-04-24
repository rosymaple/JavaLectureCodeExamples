package org.example.week2;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args)  {       // start of main method

        // Example int array
        int[] numbers = new int[5];     // initialize numbers array...
        numbers[0] = 4;     // set the first element of our array to 4...
        numbers[1] = 100;   // set the second element of our array to 100 (start counting from 0 in java)
//        numbers[5] = 3;

        String[] classNames = { "Java", "C#", "Web"};       // initialize classNames array
//        classNames[0] = "Java";
//        classNames[1] = "C#";
//        classNames[2] = "Web";

        System.out.println("One of the second year classes is " + classNames[2]);    //print 2nd element from array

//        int numberOfClasses = classNames.length;
        System.out.println("There are " + classNames.length + " classes."); //print classNames.length() for user.

        for (int x=0; x<classNames.length; x++) {   // our loop counter over classNames array...
            System.out.println("A class name is " + classNames[x]);     // print individual element from classNames
        }       // end of for loop counter...

        System.out.println(Arrays.toString(classNames));        // print classNames array
    }       // end of main method
}       // end of public class
