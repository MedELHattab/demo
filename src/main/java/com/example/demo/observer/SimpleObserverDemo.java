package com.example.demo.observer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Simple demonstration of the Observer pattern
 */
@Component
public class SimpleObserverDemo implements CommandLineRunner {

    @Override
        public void run(String... args) {
        System.out.println("\n===== Simple Observer Pattern Demo =====\n");

        // Create the subject
        SimpleSubject subject = new SimpleSubject();

        // Create observers
        SimpleObserver observer1 = new ConcreteObserver("Observer 1");
        SimpleObserver observer2 = new ConcreteObserver("Observer 2");

        // Register observers with the subject
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Change the subject's state - all observers will be notified
        subject.setState("First state change");

        // Remove an observer
        subject.removeObserver(observer1);

        // Change state again - only observer2 will be notified
        subject.setState("Second state change");

        System.out.println("\n===== End of Demo =====");
    }
}