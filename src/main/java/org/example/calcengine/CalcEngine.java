package org.example.calcengine;

public class CalcEngine {
    // 10 - Using Switch Statement and Conditional Assignment
    public static void engine() {
        double val1 = 100.0d;
        double val2 = 50.0d;
        double result = 0.0d;
        char optCode = 'd';


        switch (optCode) {
            case 'a':
                result = val1 + val2;
                break;
            case 's':
                result = val1 - val2;
                break;
            case 'm':
                result = val1 * val2;
                break;
            case 'd':
                result = val2 != 0 ? val1 / val2 : 0.0d;
            default:
                System.out.println("Invalid optCode: " + optCode);
                result = 0.0d;
                break;
        }

        System.out.println(result);
    }
}
