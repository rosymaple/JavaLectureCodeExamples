package org.example.week3;

public class Marathon {
    public static void main(String[] args) {
        double currentDistance = 1;     // predetermined variable for our program
        double targetDistance = 26.2;       // initializes a target distance for our marathoner
        double percentIncrease = 1.20;      // the percentage value that we want our runner to increase by

        marathonSchedule(currentDistance, targetDistance, percentIncrease);     // our marathon schedule arguments
    }
    public static void marathonSchedule(double currentDistance, double targetDistance, double percentIncrease ) {
        // three marathonSchedule arguments...
        int week = 1;       // we will start at week 1 instead of week 0...
        // loop until the current distance is greater than the target distance
        // the loop will count the number of weeks
        while (currentDistance < targetDistance) {      // while loop for when currentDistance is LESS than the target.
            System.out.println(week + " " + currentDistance);       // this is the output line for the user
            currentDistance = currentDistance * percentIncrease;        //increase by 10 percent every week
            week++;     //for every loop through this while loop, add a number to week counter variable.
        }       // end of while loop
        // need to print one more line = the distance that is greater than the marathon distance
        System.out.println(week + " " + currentDistance);   // prints all of our program's output for the user
    }       // end of marathonSchedule method
}       // end of public class Marathon
