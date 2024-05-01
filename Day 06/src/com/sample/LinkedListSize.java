package com.sample;

import java.util.LinkedList;

public class LinkedListSize {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(700);
        
        
        int size = list.size();
        
        
        System.out.println("Size of the LinkedList: " + size);
    }
}

