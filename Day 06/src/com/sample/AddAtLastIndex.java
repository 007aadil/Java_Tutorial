package com.sample;

import java.util.ArrayList;

public class AddAtLastIndex {
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

        // Find the index of the last occurrence of 10
        int lastIndex = -1;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == 10) {
                lastIndex = i;
                break;
            }
        }

        // Add value 100 at the last index of 10
        if (lastIndex != -1) {
            list.add(lastIndex + 1, 100);
            System.out.println("Value 100 added at the last index of 10.");
        } else {
            System.out.println("Value 10 is not present in the list.");
        }

        // Print the list after adding
        System.out.println("List after adding value 100: " + list);
    }
}
