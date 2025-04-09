package com.example.demo.observer;

/**
 * Concrete implementation of the SimpleObserver
 */
public class ConcreteObserver implements SimpleObserver {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}