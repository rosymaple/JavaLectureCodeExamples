 package org.example.week3;

import java.util.Arrays;

public class PassByValue {
    public static void main(String[] args) {

        int miles = 6;      // initialize our miles variable which is 6
        miles = changeToKM(miles);      // perform changeToKM method on miles variable
        System.out.println(miles);  // miles is still equal to 6 at this point in the program

        String units = "miles";     // initialize our "units" variable which is "miles"
        units = changeToMetricUnits(units);         // use changeToMetricUnits variable on units variable
        System.out.println(units);      // print units for our user

        double[] speeds = {4, 5, 10, 12}; // each element is miles per hour. initializing speeds array.
        convertToKilometers(speeds);        // perform convertToKilometers method on speeds array values.
        System.out.println(Arrays.toString(speeds));        // print speeds array for our user.
    }       // end of main method

    // changing a primitive type parameter has no effect on the data in the caller
    private static int changeToKM(int distance) {       // changeToKM method with one argument, distance
        distance = 10;      // set variable distance to 10, an int value.
        return distance;        // return int distance variable to main
    }       // end of private int method
    // changing a String parameter has no effect on the data in the caller
    private static String changeToMetricUnits(String units) {       //changeToMetricUnits method with one argument units
        units = "kilometers";       // units = kilometers in this method, using this method.
        return units;       // return units back to main method
    }       // end of private string method
    private static void convertToKilometers(double[] speeds) {      // convertToKilometers only argument is speeds array
        for (int s = 0; s < speeds.length ; s++) {      // loop over speeds array lenth
            double speed = speeds[s];       // "speed" is an element in speeds array.
            double speedKM = speed * 1.6;       // speedKM is a calculation using the speed variable.
            speeds[s] = speedKM;        // covert speed value in speeds array to speedKM variable, which is an equation
        }       // end of for loop over speeds array
    }       // end of private void method
}       // end of public class PassByValue
