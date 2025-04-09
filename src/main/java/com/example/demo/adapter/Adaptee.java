package com.example.demo.adapter;

/**
 * The existing class with incompatible interface
 */
public class Adaptee {
    /**
     * Method with incompatible signature that does something useful
     * @return The specific result
     */
    public String specificRequest() {
        return "Adaptee's specific request";
    }
}