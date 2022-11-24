package com.cc.java;

public class Cat {
 
    private String name;
    private String furColor;
    private int age;
    private int level;

    public Cat( String name, String furColor    	 ) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
	}

    public String getStringAttributes( String flag ) {
        switch ( flag ) {
            case "#name":
                return name;
            case "#furColor":
                return furColor;
            default:
                return "Error";
        }
    }
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