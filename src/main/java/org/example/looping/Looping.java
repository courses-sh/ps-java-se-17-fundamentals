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

    public static void dowWileLoop() {
        int init = 80;

        do {
            System.out.print(init);
            System.out.print(" * 2 = ");
            init *= 2;
            System.out.println(init);
        } while (init < 25);
    }
}
