package com.sample;

import java.util.ArrayList;

public class RemoveAllValues2 {
    public static void main(String[] args) {
        // Input lists
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(90);
        list1.add(10);
        list1.add(10);
        list1.add(40);
        list1.add(50);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(60);
        list2.add(50);
        list2.add(40);
        list2.add(70);
        list2.add(80);
        list2.add(90);

        // Remove all elements from list1 that are present in list2
        list1.removeAll(list2);

        // Print list1 after removal
        System.out.println("List after removeAll(): " + list1);
    }
}

