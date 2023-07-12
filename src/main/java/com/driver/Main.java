package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        // obj.name = "John"; // Error: 'name' has private access in 'com.driver.RWOnly'
        // System.out.println(obj.name); // Error: 'name' has private access in 'com.driver.RWOnly'

        obj.setName("karthi"); // Set a value to name using the setter method
        System.out.println(obj.getName()); // Retrieve and print the value of name using the getter method
    }
}