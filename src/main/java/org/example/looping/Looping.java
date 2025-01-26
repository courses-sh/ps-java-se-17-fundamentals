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
        System.out.println();
    }

    public static void forLoop() {
        for (int i = 1; i < 100; i *= 2) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void arrays() {
        // float[] vals = new float[3];

        // vals[0] = 10.0f;
        // vals[1] = 20.0f;
        // vals[2] = 30.0f;

        float[] vals = {10.0f, 20.0f, 30.0f};

        float sum = 0.0f;
        for (int i = 0; i < vals.length; i++) {
            sum += vals[i];
        }
        System.out.println("sum: " + sum);
        System.out.println();
    }
}
