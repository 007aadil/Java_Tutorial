package com.sample;

import java.util.ArrayList;

public class ValueAtIndex3 {
    public static void main(String[] args) {
        // Input list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(105);
        list.add(205);
        list.add(305);
        list.add(405);
        list.add(505);
        list.add(605);
        list.add(705);
        list.add(805);

        // Get the value present at the 8th index
        int value = list.get(7);

        // Print the value present at the 8th index
        System.out.println("Value present at the 8th index: " + value);
    }
}

