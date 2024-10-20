package org.example.calcengine;

public class CalcEngine {
    // 05 - Looping and Arrays -> 06 - CalcEngine and Parallel Arrays
    public static void engine() {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] optCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[optCodes.length];


        for (int i = 0; i < optCodes.length; i++) {
            switch (optCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
                default:
                    System.out.println("Invalid optCode: " + optCodes[i]);
                    results[i] = 0.0d;
                    break;
            }
        }
        System.out.println(results.length);
    }
}
