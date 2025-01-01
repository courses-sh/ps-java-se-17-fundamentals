package org.example.methods;

public class DeclaringAndCallingMethods {
    public static void doSomething() {
        System.out.println("Inside the method");
        System.out.println("Still inside");
    }

    public static void showSum(float x, float y, int count) {
        float sum = x + y;
        for (int i = 1; i <= count; i++) {
            System.out.println(sum * i);
        }
    }
}
