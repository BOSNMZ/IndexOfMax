package com.example;

public class indexofmax {
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int max = array[0]; 

       
        for (int currentElement : array) {
            if (currentElement > max) {
                
                max = currentElement;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // Example usage
        int[] numbers = {42, 18, 56, 72, 91, 63, 105, 29, 84, 50, 77, 99, 120};
        int maxValue = findMax(numbers);
        System.out.println("Largest element: " + maxValue);
    }
}
