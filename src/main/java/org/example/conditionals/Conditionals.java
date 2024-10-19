package org.example.conditionals;

public class Conditionals {
    public static void conditionalLogic() {
        int a = 16;
        int b = 32;
        int max = a > b ? a : b;
        System.out.println("max: " + max);
    }

    public static void logicalVsConditional() {
        int students = 150;
        int rooms = 0;

        if (rooms != 0 && students / rooms > 30) {
            System.out.println("Crowded");
        }


        System.out.println();
        System.out.println("*** end of program ***");
    }

    public static void blockStatements() {
        int v1 = 10, v2 = 4;
        final int diff;

        if (v1 > v2) {
            diff = v1 - v2;
            System.out.println("v1 is greater than v2. diff = " + diff);
        } else {
            diff = v2 - v1;
            System.out.println("v2 is greater than v1. diff = " + diff);
        }
    }
}
