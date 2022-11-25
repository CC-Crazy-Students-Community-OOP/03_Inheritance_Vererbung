package com.cc.java;

public class Supercat {
    private String name;
    private String color;
    private int age;

    public Supercat( String name, String color, int age ) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getStringAttributes( String flag ) {
        switch ( flag ) {
            case "#name":
                return name;
            case "#color":
                return color;
            default:
                return "Error";
        }
    }

}
