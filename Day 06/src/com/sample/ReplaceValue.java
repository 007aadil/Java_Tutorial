package com.sample;

import java.util.ArrayList;

public class ReplaceValue {
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

        // Replace the value 300 with 350
        int oldValue = 300;
        int newValue = 350;
        int index = list.indexOf(oldValue);
      
            list.set(index, newValue);
            System.out.println("Value 300 replaced with 350.");
        

        // Print the list after replacement
        System.out.println("List after replacement: " + list);
    }
}

