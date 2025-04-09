package com.example.demo.adapter;

/**
 * Client code that works with Target objects
 */
public class Client {

    private Target target;

    public Client(Target target) {
        this.target = target;
    }

    /**
     * Client method that uses the target
     */
    public void execute() {
        String result = target.request();
        System.out.println("Client: Result from target: " + result);
    }
}