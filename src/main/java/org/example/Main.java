package org.example;

public class Main {
    public static void main(String[] args) {
        int myVar;
        myVar = 50;
        System.out.println("myVar: " + myVar);

        int anotherVar = 100;
        System.out.println("anotherVar: " + anotherVar);

        myVar = anotherVar;
        System.out.println("myVar: " + myVar);

        // once the value of a `final` variable is set, you cannot modify it.
        final int maxStudent = 25;
        System.out.println("maxStudent: " + maxStudent);

        final int someVariable;
        final int someOtherVariable = 100;
        someVariable = someOtherVariable;
        System.out.println("someVariable: " + someVariable);
        System.out.println("someOtherVariable: " + someOtherVariable);
    }
}