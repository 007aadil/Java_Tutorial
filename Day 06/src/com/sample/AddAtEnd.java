package com.sample;

import java.util.ArrayList;

public class AddAtEnd {
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

        // Add value 70 at the end of the list
        int valueToAdd = 70;
        list.add(valueToAdd);

        // Print the list after adding
        System.out.println("List after adding value 70 at the end: " + list);
    }
}

