package com.sample;

import java.util.ArrayList;

public class ValueAtIndex2 {
    public static void main(String[] args) {
        // Input list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(700);

        // Get the value present at the 4th index
        int value = list.get(3);

        // Print the value present at the 4th index
        System.out.println("Value present at the 4th index: " + value);
    }
}

