package com.cc.java;

public class Supercat {
    private String name;
    private String color;
    protected int age;

    public Supercat( String name, String color, int age ) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getStringAttributes( String flag ) {
        switch ( flag ) {
            case "#name":
                return App.c( "#g" ) + name;
            case "#color":
                return App.c( "#c" ) + color;
            default:
                return App.c( "#r" ) + "Error";
        }
    }
}