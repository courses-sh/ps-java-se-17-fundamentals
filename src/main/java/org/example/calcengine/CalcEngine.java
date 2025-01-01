package org.example.calcengine;

public class CalcEngine {
    // 05 - Looping and Arrays -> 08 - CalcEngine and For-each Loop
    public static void engine() {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] optCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[optCodes.length];


        for (int i = 0; i < optCodes.length; i++) {
            results[i] = execute(optCodes[i], leftVals[i], rightVals[i]);
        }

        for (double current : results) {
            System.out.println("current: " + current);
        }
    }

    static double execute(char optCode, double leftVal, double rightVal) {
        // double result;
        // switch (optCode) {
        //     case 'a':
        //         result = leftVal + rightVal;
        //         break;
        //     case 's':
        //         result = leftVal - rightVal;
        //         break;
        //     case 'm':
        //         result = leftVal * rightVal;
        //         break;
        //     case 'd':
        //         result = rightVal != 0 ? leftVal / rightVal : 0.0d;
        //         break;
        //     default:
        //         System.out.println("Invalid optCode: " + optCode);
        //         result = 0.0d;
        //         break;
        // }
        //
        // return result;

        // this is the shorthand for the above code
        return switch (optCode) {
            case 'a' -> leftVal + rightVal;
            case 's' -> leftVal - rightVal;
            case 'm' -> leftVal * rightVal;
            case 'd' -> rightVal != 0 ? leftVal / rightVal : 0.0d;
            default -> {
                System.out.println("Invalid optCode: " + optCode);
                yield 0.0d;
            }
        };
    }
}
