package com.cc.java;

public class App {
    public static void main(String[] args) {
    
        Tomcat tomcat = new Tomcat( "Steve", "grey", 5 );
            output( tomcat.getStringAttributes( "#name" ) );
            output( tomcat.getStringAttributes( "#furColor" ) );
            output( tomcat.getAge() );
            output( "------------------------" );
            
        Cat cat = new Cat( "Rose", "white", 4 );
            output( cat.getStringAttributes( "#name" ) );
            output( cat.getStringAttributes( "#furColor" ) );
            output( cat.getAge() );
            output( cat.getAge() );
            output( cat.getAge() );
            output( cat.getAge() );
            output( cat.getAge() );
            output( "------------------------" );
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }
}