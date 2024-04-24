package org.example.week2;

import static input.InputUtils.doubleInput;

public class AverageTestScoreSimpleLoop {       // start of public class
    public static void main(String[] args) {        // start of main method
    // Calculate the average of 5 test scores
    int numberOfTests = 5;      // initialize our numberofTests variable which will be 5
    double testScore;       // initialize testScore variable which will be a double,
    double testScoreSum = 0.0;      // initialize our testScoreSum which will start at 0
    double testScoreAverage;        // initialize our testScoreAverage variable.

    for (int test = 1 ; test <= numberOfTests ; test++) {       // for loop counter for numberOfTests
        testScore = doubleInput("Enter test score #" + test);
        // initalize testScore which will be a double variable.
        testScoreSum = testScoreSum + testScore;        // testScoreSum will add two variables together.
    }

    testScoreAverage = testScoreSum / numberOfTests;        // testScoreAverage will be an equation.
    System.out.println("Average score = " + testScoreAverage);      // print testScoreAverage for our user.
    }       // end of main method
}       // end of public class