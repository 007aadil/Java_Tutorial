package com.sample;

import java.util.ArrayList;

public class AddAtIndex {
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

        // Add value 50 at the 2nd index
        int indexToAdd = 2;
        int valueToAdd = 50;
        list.add(indexToAdd, valueToAdd);

        // Print the list after adding
        System.out.println("List after adding value 50 at the 2nd index: " + list);
    }
}

