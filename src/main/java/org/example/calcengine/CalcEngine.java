package org.example.calcengine;

import java.util.Scanner;

public class CalcEngine {
    // 05 - Looping and Arrays -> 08 - CalcEngine and For-each Loop
    public static void engine(String[] args) {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation(MathOperation.DIVIDE, 100.0d, 50.0d);
        equations[1] = new MathEquation(MathOperation.ADD, 25.0d, 92.0d);
        equations[2] = new MathEquation(MathOperation.SUBTRACT, 225.0d, 17.0d);
        equations[3] = new MathEquation(MathOperation.MULTIPLY, 11.0d, 3.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println(equation);
        }

        System.out.println("Average result = " + MathEquation.getAverageResult());

        // useOverloads();
        executeCli(args);
    }

    private static void executeCli(String[] args) {
        if (args.length >= 1) {
            if (args.length == 1 && args[0].equals("interactive")) {
                executeInteractively();
            } else if (args.length == 3) {
                handleCommandLine(args);
            } else {
                System.out.println("Please provide an operation code and 2 numeric values");
            }
        }
    }

    private static void useOverloads() {
        System.out.println("\nUsing Overloads\n");
        MathEquation equationOverload = new MathEquation(MathOperation.DIVIDE);
        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("Overload result with doubles: " + equationOverload.getResult());
    }

    static void executeInteractively() {
        System.out.println("Enter an operation and two numbers");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts) {
        MathOperation opCode = MathOperation.valueOf(parts[0].toUpperCase());
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);

        MathEquation equation = new MathEquation(opCode, leftVal, rightVal);
        equation.execute();
        System.out.println(equation);
    }

    private static void displayResult(char opCode, double leftVal, double rightVal, double result) {
        char symbol = symbolFromOpCode(opCode);
        StringBuilder builder = new StringBuilder(20);
        builder.append(leftVal);
        builder.append(" ");
        builder.append(symbol);
        builder.append(" ");
        builder.append(rightVal);
        builder.append(" = ");
        builder.append(result);
        String output = builder.toString();
        System.out.println(output);
    }

    private static char symbolFromOpCode(char opCode) {
        char[] opCodes = {'a', 's', 'm', 'd'};
        char[] symbols = {'+', '-', '*', '/'};
        char symbol = ' ';
        for (int index = 0; index < opCodes.length; index++) {
            if (opCode == opCodes[index]) {
                symbol = symbols[index];
                break;
            }
        }

        return symbol;
    }

    private static void handleCommandLine(String[] args) {
        char optCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);

        double result = execute(optCode, leftVal, rightVal);
        System.out.println(result);
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

    static char opCodeFromString(String operationName) {
        return operationName.charAt(0);
    }

    static double valueFromWord(String word) {
        String[] numberWords = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        boolean isValueSet = false;
        double value = 0d;
        for (int index = 0; index < numberWords.length; index++) {
            if (word.equals(numberWords[index])) {
                value = index;
                isValueSet = true;
                break;
            }
        }

        if (!isValueSet) {
            value = Double.parseDouble(word);
        }

        return value;
    }
}
