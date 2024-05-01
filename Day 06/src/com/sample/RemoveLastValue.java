package com.sample;

import java.util.ArrayList;

public class RemoveLastValue {
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

        // Find and remove the last occurrence of value 10
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == 10) {
                list.remove(i);
                break; // Remove only the first occurrence
            }
        }

        // Print the list after removal
        System.out.println("List after removing last occurrence of value 10: " + list);
    }
}
