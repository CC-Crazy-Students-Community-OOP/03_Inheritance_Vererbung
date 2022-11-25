package com.cc.java;

public class Cat {
    private int age;
    private int level;

    public String getAge() {
        return checkEscaltionLevel();
    }

    private String checkEscaltionLevel() {
        level++;
        switch ( level ) {
            case 1:
                return "DARE to ask";
            case 2:
                return "Really?";
            case 3:
                return "Seriously?";
            default:
                return "Some peolples never learn to be decent";
        }
    }
}