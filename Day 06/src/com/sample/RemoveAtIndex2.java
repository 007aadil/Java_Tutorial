package com.sample;

import java.util.ArrayList;

public class RemoveAtIndex2 {
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

        // Remove the value present at the 10th index
        int indexToRemove = 9;
        if (indexToRemove < list.size()) {
            list.remove(indexToRemove);
            System.out.println("Value at the 10th index removed successfully.");
        } else {
            System.out.println("Cannot remove value at the 10th index as the list is shorter.");
        }

        // Print the list after removal
        System.out.println("List after removal: " + list);
    }
}

