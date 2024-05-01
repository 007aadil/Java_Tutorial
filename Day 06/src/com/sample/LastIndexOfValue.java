package com.sample;

import java.util.ArrayList;

public class LastIndexOfValue {
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

       
        int lastIndex = -1;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == 10) {
                lastIndex = i;
                break;
            }
        }

       
        System.out.println("Last index value of 10: " + lastIndex);
    }
}
