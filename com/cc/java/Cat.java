package com.cc.java;

public class Cat extends Supercat{
    private int level;

    public Cat( String name, String color, int age ) {
        super( name, color, age );
    }

    public String getAge() { 
        return checkEscaltionLevel(); 
    }

    private String checkEscaltionLevel() {
        level++;
        switch ( level ) {
            case 1:
                return "    Alter: " + App.c( "#c" ) +  "DARE to ask";
            case 2:
                return "    Alter: " + App.c( "#y" ) +  "Really?";
            case 3:
                return "    Alter: " + App.c( "#r" ) +  "Seriously?";
            default:
                return "    Alter: " + App.c( "#r" ) +  "Some peolples never learn to be decent";
        }
    }
}