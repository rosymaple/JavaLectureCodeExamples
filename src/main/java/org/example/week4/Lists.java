package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args)  {       // use main method
        List<String> arrayList = new ArrayList<>();     // initialize arrayList variable "arrayList"
        arrayList.add("Hello");     // add to array
        arrayList.add("World");     // add element
        arrayList.add("Clara");     // add favorite teacher element to arrayList
        arrayList.add("MCTC");      // add element

        for (String s: arrayList)   {       // loop over every element in arrayList
            System.out.println(s);      // print every element (looping)
            System.out.println(s.toUpperCase());        // print every element in upper case
            System.out.println(s.length());     // print the length of each arrayList element
        }       // end of loop over arrayList

        System.out.println(arrayList);      // end of arrayList
    }       // end of main method
}       // end of public class
