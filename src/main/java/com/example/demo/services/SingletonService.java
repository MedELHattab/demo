package com.example.demo.services;

import com.example.demo.Singleton;
import org.springframework.stereotype.Service;

/**
 * Service demonstrating the use of the Singleton pattern
 */
@Service
public class SingletonService {

    /**
     * Demonstrate that multiple calls to getInstance() return the same instance
     */
    public void demonstrateSingleton() {
        System.out.println("\n==== Singleton Pattern Demonstration ====");

        // Get first instance
        Singleton firstInstance = Singleton.getInstance();
        System.out.println("First instance obtained");
        firstInstance.showInfo();

        // Modify the first instance
        firstInstance.setData("Data modified by first reference");
        System.out.println("Data in first instance modified");

        // Get second instance (should be the same)
        Singleton secondInstance = Singleton.getInstance();
        System.out.println("\nSecond instance obtained");
        secondInstance.showInfo();

        // Check if they are the same instance
        boolean isSameInstance = (firstInstance == secondInstance);
        System.out.println("\nAre both references pointing to the same instance? " + isSameInstance);

        // Modify through the second reference
        secondInstance.setData("Data modified by second reference");
        System.out.println("Data modified through second reference");

        // Show that both references see the updated data
        System.out.println("\nFirst instance after second modified the data:");
        firstInstance.showInfo();

        System.out.println("\nSecond instance:");
        secondInstance.showInfo();

        System.out.println("\n==== End of Singleton Demonstration ====");
    }
}