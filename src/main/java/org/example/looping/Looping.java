package org.example.looping;

public class Looping {
    public static void whileLoop() {
        int val = 4;
        int factorial = 1;

        while (val > 1) {
            factorial *= val;
            val--;
        }
        System.out.println(factorial);
    }
}
