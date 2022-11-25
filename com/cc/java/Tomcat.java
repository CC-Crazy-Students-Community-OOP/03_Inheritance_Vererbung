package com.cc.java;

public class Tomcat extends Supercat{
    public Tomcat( String name, String color, int age ) {
        super( name, color, age );
    }

    public String getAge() {
        return "    Alter: " + App.c( "#c" ) + age;
    }
}