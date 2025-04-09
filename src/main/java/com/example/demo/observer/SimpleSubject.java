package com.example.demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple Subject that notifies observers
 */
public class SimpleSubject {
    private List<SimpleObserver> observers = new ArrayList<>();
    private String state;

    /**
     * Add an observer to the notification list
     */
    public void addObserver(SimpleObserver observer) {
        observers.add(observer);
    }

    /**
     * Remove an observer from the notification list
     */
    public void removeObserver(SimpleObserver observer) {
        observers.remove(observer);
    }

    /**
     * Set a new state and notify all observers
     */
    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * Notify all registered observers
     */
    private void notifyAllObservers() {
        for (SimpleObserver observer : observers) {
            observer.update(state);
        }
    }
}