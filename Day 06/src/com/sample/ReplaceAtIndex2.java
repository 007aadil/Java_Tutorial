package com.sample;

import java.util.ArrayList;

public class ReplaceAtIndex2 {
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

        // Replace the value at the 7th index with 90
        int indexToReplace = 7;
        int newValue = 90;
        list.set(indexToReplace, newValue);
        System.out.println("Value at the 7th index replaced with 90.");
        

        // Print the list after replacement
        System.out.println("List after replacement: " + list);
    }
}

    

