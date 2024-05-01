package com.sample;

import java.util.ArrayList;

public class ArrayListLength {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(90);
        list.add(10);
        list.add(10);
        list.add(40);
        list.add(50);
        
        int length = list.size();
        
        System.out.println("Length of the ArrayList: " + length);
    }
}

