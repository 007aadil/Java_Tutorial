package com.sample;

import java.util.Vector;

public class VectorLength {
    public static void main(String[] args) {
       
        Vector<Integer> vector = new Vector<>();
        vector.add(105);
        vector.add(205);
        vector.add(305);
        vector.add(405);
        vector.add(505);
        vector.add(605);
        vector.add(705);
        vector.add(805);
        
       
        int length = vector.size();
        
        
        System.out.println("Length of the Vector: " + length);
    }
}

