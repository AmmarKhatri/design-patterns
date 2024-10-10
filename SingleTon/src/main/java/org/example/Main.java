package org.example;

public class Main {
    public static void main(String[] args) {
        // Use a for loop to create and start 5 threads
        for (int i = 1; i <= 5; i++) {
            final int threadNumber = i; // To keep track of the thread number
            new Thread(() -> {
                // Acquire the singleton instance
                SingleTon instance = SingleTon.getInstance();
                // Print out the instance and thread name
                System.out.println("Thread " + threadNumber + " acquired instance: " + instance);
            }).start();
        }
    }
}
