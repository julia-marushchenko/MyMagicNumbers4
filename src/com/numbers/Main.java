// Java program to  find numbers divided by 3 without rest in range (18, 87)

package com.numbers;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating loop to go through numbers (18, 87)
        for (int index = 19; index < 87; index++) {

            // Condition
            if (index % 3 == 0) {

                // Printing result to console
                System.out.println(index + " can be divided by 3");

            } else {

                // Printing result to console
                System.out.println(index + " cannot be divided by 3");

            }
        }
    }
}
