package org.example.week4;

import java.util.List;

public class ListOf {
    public static void main(String[] args) {        // start of main method

        List<String> animals = List.of("Cat", "Bird", "Zebra"); //create read-only list using List.of...
        // on our animals arrayList
        System.out.println(animals);        //print animals arrayList
        animals.remove("Frog");     // remove "Frog" element from arrayList, note List.of is for immutable lists.
    }       // end of main method
}       // end of public class
