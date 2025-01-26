package org.example.methods;

import org.example.classes.Flight;

public class ACloserLookAtMethods {
    public static void overridingObjectEquality() {
        Flight f1 = new Flight(175);
        Flight f2 = new Flight(175);

        if (f1 == f2) {
            System.out.println("flights are equal with == op");
        } else {
            System.out.println("== doesn't work for object equality");
        }

        if (f1.equals(f2)) {
            System.out.println("flights are equal with `.equals()` method");
        } else {
            System.out.println("flights are not equal");
        }
        System.out.println();
    }
}
