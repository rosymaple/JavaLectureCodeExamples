package org.example.week2;

public class ForLoops {
    public static void main(String[] args) {

        // print numbers 1-5
        for (int x=1; x <= 5; x++) {        // loop counter from 1 to 5...
            System.out.println(x);      // print each number from 1 to 5 which is represented by "x" here
        }       // end of for loop

        // Print 10, 9, 8, 7...0
        for (int x=10; x>=0; x--) {     // loop counter from 10 to 0...
            System.out.println(x + "...");      // print loop counter starting from 10 to 0 and add ellipses...
        }       // end of loop counter
    }       // end of public main method
}       // end of public class
