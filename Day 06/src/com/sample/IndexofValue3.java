package com.sample;

import java.util.ArrayList;

public class IndexofValue3 {
    public static void main(String[] args) {
        // Input list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(90);
        list.add(10);
        list.add(10);
        list.add(40);
        list.add(50);
        list.add(10);

        // Find the index value(s) of 70
        int targetValue = 70;
        boolean found = false;
        System.out.println("Index value(s) of " + targetValue + ":");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == targetValue) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println(targetValue + " is not found in the list.");
        }
    }
}
