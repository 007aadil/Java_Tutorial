package com.sample;

import java.util.ArrayList;

public class ReplaceAllOccurrences {
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
        list.add(30);

        // Replace all occurrences of 10 with 100
        int oldValue = 10;
        int newValue = 100;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == oldValue) {
                list.set(i, newValue);
            }
        }

        // Print the list after replacement
        System.out.println("List after replacing all occurrences of 10 with 100: " + list);
    }
}

