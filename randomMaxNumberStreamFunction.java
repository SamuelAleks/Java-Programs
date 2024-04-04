// This Java program maintains a circular buffer of the last 5 processed items and returns the maximum value among them.

import java.util.Random;

public class randomMaxNumberStreamFunction {
    static int pointer = 0; // Keeps track of the current position in the array
    static long[] array = new long[5]; // Array to store the last 5 processed items

    // Method to process each item and return the maximum value among the last 5
    // items
    public static long processItem(long item) {
        long maximumValue = 0; // Variable to store the maximum value
        pointer = (pointer + 1) % array.length; // Move the pointer circularly within the array
        array[pointer] = item; // Store the current item in the array

        // Loop through the array to find the maximum value
        for (int i = 0; i < array.length; i++) {
            maximumValue = Math.max(maximumValue, array[i]); // Update maximumValue if a larger value is found
        }
        return maximumValue; // Return the maximum value among the last 5 items
    }

    // Main method
    public static void main(String[] args) {
        Random random = new Random(1); // Create a Random object with seed 1
        for (int i = 0; i < 20; i++) { // Loop 20 times
            long inValue = random.nextLong(37); // Generate a random long value less than 37
            System.out.println("IN: " + inValue + " OUT: " + processItem(inValue)); // Output the processed item
        }
    }
}
