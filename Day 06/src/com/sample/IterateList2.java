package com.sample;

import java.util.ArrayList;

public class IterateList2 {
    public static void main(String[] args) {
        // Input list
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(105);
        list.add(205);
        list.add(305);
        list.add(405);
        list.add(505);
        list.add(605);
        list.add(705);
        list.add(805);

        // Iterate through the list using an enhanced for loop
        System.out.println("Values of the list:");
        for (int value : list) {
            System.out.println(value);
        }
    }
}

