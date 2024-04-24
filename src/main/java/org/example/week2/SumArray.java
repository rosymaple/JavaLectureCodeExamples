package org.example.week2;
public class SumArray {
    public static void main(String[] args) {

        double numbers[] = new double[3];       // this array stores 3 double variables. empty for now except for index

        // add data to each element of array (0,1,2)
        numbers[0] = 45.234256;
        numbers[1] = -123945.22;
        numbers[2] = 0.0000003;

        double sum = 0.0;       // initialize sum variable as 0 because we will add data to this

        // Loop over the array, and add each value to the sum variable
        for (int x = 0 ; x < numbers.length ; x++) {        // loops over length of numbers array, to find the sum...
            sum = sum + numbers[x];     // sum is every variable from numbers added together
        }       // end of for loop over numbers array
        System.out.println("Total of numbers = " + sum);        // print total added up from every number from array.
    }       // end of public method
}       // end of public class