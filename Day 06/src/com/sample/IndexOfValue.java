package com.sample;

import java.util.ArrayList;

public class IndexOfValue {
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

        // Find the index value of 50
        int index = list.indexOf(50);

        // Print the index value of 50
        System.out.println("Index value of 50: " + index);
    }
}

