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
}
