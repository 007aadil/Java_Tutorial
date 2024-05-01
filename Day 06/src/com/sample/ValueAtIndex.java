package com.sample;

import java.util.ArrayList;

public class ValueAtIndex {
    public static void main(String[] args) {
        // Input list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        // Get the value present at the 2nd index
        int value = list.get(2);

        // Print the value present at the 2nd index
        System.out.println("Value present at the 2nd index: " + value);
    }
}

