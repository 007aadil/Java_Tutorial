package com.sample;

public class ArraySum {
    public static void main(String[] args) {
        // Input array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Variable to store the sum
        int sum = 0;
        
        // Loop through the array and sum the values
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        // Print the sum
        System.out.println("Sum of the array elements: " + sum);
    }
}
