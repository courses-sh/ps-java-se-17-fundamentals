package org.example.calcengine;

public class CalcEngine {
    public static void engine() {
        double val1 = 100.0d;
        double val2 = 50.0d;
        double result = 0.0d;
        char optCode = 'd';

        if (optCode == 'a')
            result = val1 + val2;
        else if (optCode == 's')
            result = val1 - val2;
        else if (optCode == 'm')
            result = val1 * val2;
        else if (optCode == 'd')
            result = val1 / val2;
        else {
            System.out.println("Invalid optCode: " + optCode);
            result = 0.0d;
        }

        System.out.println(result);
    }
}
