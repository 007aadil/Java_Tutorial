package com.sample;

import java.util.ArrayList;

public class CommonValues2 {
    public static void main(String[] args) {
        // Input lists
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(90);
        list1.add(10);
        list1.add(10);
        list1.add(40);
        list1.add(50);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(60);
        list2.add(50);
        list2.add(40);
        list2.add(70);
        list2.add(80);
        list2.add(90);

        // Find common values
        ArrayList<Integer> commonValues = new ArrayList<>();
        for (Integer value : list1) {
            if (list2.contains(value)) {
                commonValues.add(value);
            }
        }

        // Print common values
        System.out.println("Common values: " + commonValues);
    }
}

