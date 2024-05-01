package com.sample;

import java.util.ArrayList;

public class CommonValues3 {
    public static void main(String[] args) {
        // Input lists
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(70);
        list1.add(80);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(400);
        list2.add(500);
        list2.add(600);
        list2.add(700);
        list2.add(8000);

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

