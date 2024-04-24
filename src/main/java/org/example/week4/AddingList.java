package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class AddingList {
    public static void main(String[] args)  {       // start of main method

        List<Integer> classCodes = new ArrayList<>();       // arrayList of Integer objects called "classCodes"
        classCodes.add(2545);       // add element to arrayList
        classCodes.add(1150);       // add element
        classCodes.add(1250);       // add element

        classCodes.add(0, 1425);        // add element to replace index 0
        classCodes.add(2, 1100);        // add element to replace index 2

        System.out.println(classCodes);     // print classCodes array list
        System.out.println(classCodes.size());      // print the size of the classCodes array list

        for (int classCode: classCodes) {   // classCode
            System.out.println("ITEC " + classCode);        // print "ITEC" and classCode for the user
        }       // end of classCodes arrayList for loop

        classCodes.add(1110);       // add another element to arrayList

        System.out.println("First code: " + classCodes.get(0));     // "0" is our first code accessed by .get(0) not 1
        System.out.println("4th code: " + classCodes.get(3));       // 3 is our 4th code since we count from 0 in java
//        System.out.println("Last code: " + classCodes.get(classCodes.size()));        // this will not work

        System.out.println(classCodes);     // print classCodes arrayList
        classCodes.remove(Integer.valueOf(9));      // remove element from classCodes with integer value of 9
        System.out.println(classCodes);     //print classCodes arrayList
    }       // end of public main method
}       // end of public class
