package com.sample;

import java.util.ArrayList;

public class RemoveAtIndex {
    public static void main(String[] args) {
        // Input list
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        // Remove the value present at the 2nd index
        list.remove(2);

        // Print the list after removal
        System.out.println("List after removing value at the 2nd index: " + list);
    }
}

