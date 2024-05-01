package com.sample;

import java.util.ArrayList;

public class FirstIndexOfValue {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(90);

        
        int firstIndex = list.indexOf(10);

        
        System.out.println("First index value of 10: " + firstIndex);
    }
}
