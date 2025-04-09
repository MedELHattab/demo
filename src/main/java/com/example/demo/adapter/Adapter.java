package com.example.demo.adapter;

/**
 * The Adapter makes Adaptee compatible with the Target interface
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    /**
     * The adapter converts the interface of Adaptee to the Target interface
     */
    @Override
    public String request() {
        // Call the adaptee's method and adapt the result if needed
        String result = adaptee.specificRequest();
        return "Adapter: (TRANSLATED) " + result;
    }
}