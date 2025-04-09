package com.example.demo.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Simple demonstration of the Adapter pattern
 */
@Component
public class SimpleAdapterDemo implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("\n===== Simple Adapter Pattern Demonstration =====\n");

        // Create the adapter
        Target adapter = new Adapter();

        // Create the client with the adapter
        Client client = new Client(adapter);

        // Client uses the adapter thinking it's using the Target
        client.execute();

        System.out.println("\n===== End of Simple Adapter Demonstration =====");
    }
}