package com.example.demo.factory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Simple demonstration of the Factory Pattern
 */
@Component
public class SimpleFactoryDemo implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("\n===== Simple Factory Pattern Demonstration =====\n");

        // Create a factory
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get a Circle from the factory
        Shape circle = shapeFactory.createShape("CIRCLE");
        circle.draw();

        // Get a Rectangle from the factory
        Shape rectangle = shapeFactory.createShape("RECTANGLE");
        rectangle.draw();

        System.out.println("\n===== End of Simple Factory Demonstration =====");
    }
}