package com.cc.java;

public class App {
    public static void main(String[] args) {
    
        Tomcat tomcat = new Tomcat( "Steve", "grey", 5 );
            output( 
                tomcat.getStringAttributes( "#name" ) + "\n    Farbe: " + 
                tomcat.getStringAttributes( "#color" ) + "\n" + 
                tomcat.getAge()
            );
            output( "------------------------" );
            
        Cat cat = new Cat( "Rose", "white", 4 );
            output( 
                cat.getStringAttributes( "#name" ) + "\n    Farbe: " + 
                cat.getStringAttributes( "#color" ) + "\n" + 
                cat.getAge()
            );
            output( cat.getAge() );
            output( cat.getAge() );
            output( cat.getAge() );
            output( cat.getAge() );
            output( "------------------------" );
    }

    public static void output(String out) { System.out.println( out ); }
    public static String c( String c ) {
        switch ( c ) {
            case "#r":
                return "\u001b[31m";
            case "#g":
                return "\u001b[32m";
            case "#y":
                return "\u001b[33m";
            case "#b":
                return "\u001b[34m";
            case "#p":
                return "\u001b[35m";
            case "#c":
                return "\u001b[36m";
            default:
                return "\u001b[0m";
        }
    }
}