package com.sample;

import java.util.ArrayList;

public class AddAtIndex2 {
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

        // Add value 80 at the 8th index
        int indexToAdd = 8;
        int valueToAdd = 80;
        list.add(indexToAdd, valueToAdd);

        // Print the list after adding
        System.out.println("List after adding value 80 at the 8th index: " + list);
    }
}

