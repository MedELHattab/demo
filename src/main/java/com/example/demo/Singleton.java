package com.example.demo;

/**
 * A thread-safe Singleton implementation
 */
public class Singleton {

    // Static volatile instance for thread-safety
    private static volatile Singleton instance;

    // Sample data to demonstrate state is maintained
    private String data;

    // Private constructor to prevent direct instantiation
    private Singleton() {
        this.data = "Initial data";
        System.out.println("Singleton instance created");
    }

    /**
     * Gets the singleton instance using double-checked locking
     * @return the singleton instance
     */
    public static Singleton getInstance() {
        // First check (not synchronized)
        if (instance == null) {
            // Synchronize on class object
            synchronized (Singleton.class) {
                // Double-check if instance is still null
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /**
     * Get the data from the singleton
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * Set new data in the singleton
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Display information about the singleton
     */
    public void showInfo() {
        System.out.println("Singleton instance hash: " + System.identityHashCode(this));
        System.out.println("Current data: " + this.data);
    }
}