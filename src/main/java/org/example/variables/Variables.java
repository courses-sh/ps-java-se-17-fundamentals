package org.example.variables;

public class Variables {
    public static void variables() {
        System.out.println("Variables:");

        int myVar;
        myVar = 50;
        System.out.println("myVar: " + myVar);

        int anotherVar = 100;
        System.out.println("anotherVar: " + anotherVar);

        myVar = anotherVar;
        System.out.println("myVar: " + myVar);

        // once the value of a `final` variable is set, you cannot modify it.
        final int maxStudent = 25;
        System.out.println("maxStudent: " + maxStudent);

        final int someVariable;
        final int someOtherVariable = 100;
        someVariable = someOtherVariable;
        System.out.println("someVariable: " + someVariable);
        System.out.println("someOtherVariable: " + someOtherVariable);
        System.out.println();
    }

    public static void primitiveDataTypesIntegers() {
        System.out.println("Primitive Data Types:");

        System.out.println("Integer Types");
        // 8-bit
        byte minBytes = Byte.MIN_VALUE;
        System.out.println("minBytes: " + minBytes);

        // 8-bit
        byte maxBytes = Byte.MAX_VALUE;
        System.out.println("maxBytes: " + maxBytes);

        // 16-bit
        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

        // 16-bit
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        // 32-bit
        int minInt = Integer.MIN_VALUE;
        System.out.println("minInt: " + minInt);

        // 32-bit
        int maxInt = Integer.MAX_VALUE;
        System.out.println("maxInt: " + maxInt);

        // 64-bit
        long minLong = Long.MIN_VALUE;
        System.out.println("minLong: " + minLong);

        // 64-bit
        long maxLong = Long.MAX_VALUE;
        System.out.println("maxLong: " + maxLong);

        // 64-bit
        long longLiteral = 31415926535897932L;
        System.out.println("longLiteral: " + longLiteral);
        System.out.println();
    }

    public static void primitiveDataTypesFloatsAndDoubles() {
        System.out.println("Floating Point Types");

        float kmsInMarathon = 42.195f;
        System.out.println("kmsInMarathon: " + kmsInMarathon);

        float absoluteZeroInCelsius = -273.15f;
        System.out.println("absoluteZeroInCelsius: " + absoluteZeroInCelsius);

        double atomsWidthInMeters = 0.0000000001d;
        System.out.println("atomsWidthInMeters: " + atomsWidthInMeters);

        // 32-bit
        float minFloat = Float.MIN_VALUE;
        System.out.println("minFloat: " + minFloat);

        // 32-bit
        float maxFloat = Float.MAX_VALUE;
        System.out.println("maxFloat: " + maxFloat);

        // 64-bit
        double minDouble = Double.MIN_VALUE;
        System.out.println("minDouble: " + minDouble);

        // 64-bit
        double maxDouble = Double.MAX_VALUE;
        System.out.println("maxDouble: " + maxDouble);
        System.out.println();
    }

    public static void primitiveDataTypesCharactersAndBooleans() {
        System.out.println("Characters");

        char regularU = 'U';
        System.out.println("regularU: " + regularU);

        char accentedU = '\u00DA';
        System.out.println("accentedU: " + accentedU);

        char charMin = Character.MIN_VALUE;
        System.out.println("charMin: " + charMin);

        char charMax = Character.MAX_VALUE;
        System.out.println("charMax: " + charMax);
        System.out.println();

        System.out.println("Booleans");

        boolean truthy = true;
        System.out.println("truthy: " + truthy);

        boolean falsey = false;
        System.out.println("falsey: " + falsey);
    }

    public static void arithmeticOperators() {
        int three = 3;
        int five = 5;
        float threeSeven = 3.7F;
        float fiveNine = 5.9F;

        System.out.println("Arithmetic operations on Integers");
        int addInt = three + five;
        System.out.println("addInt:\t\t\t" + three + " + " + five + " = " + addInt);

        int subInt = five - three;
        System.out.println("subInt:\t\t\t" + five + " - " + three + " = " + subInt);

        int multiplyInt = three * five;
        System.out.println("multiplyInt:\t" + three + " * " + five + " = " + multiplyInt);

        int divideInt = five / three;
        System.out.println("divideInt:\t\t" + five + " / " + three + " = " + divideInt);

        int modInt = five % three;
        System.out.println("modInt:\t\t\t" + five + " % " + three + " = " + modInt);

        System.out.println("\nArithmetic operations on Floats");
        float addFloat = threeSeven + fiveNine;
        System.out.println("addFloat:\t\t" + threeSeven + " + " + fiveNine + " = " + addFloat);

        float subFloat = fiveNine - threeSeven;
        System.out.println("subFloat:\t\t" + fiveNine + " - " + threeSeven + " = " + subFloat);

        float multiplyFloat = threeSeven * fiveNine;
        System.out.println("multiplyFloat:\t" + threeSeven + " * " + fiveNine + " = " + multiplyFloat);

        float divideFloat = fiveNine / threeSeven;
        System.out.println("divideFloat:\t" + fiveNine + " / " + threeSeven + " = " + divideFloat);

        float modFloat = fiveNine % threeSeven;
        System.out.println("modFloat:\t\t" + fiveNine + " % " + threeSeven + " = " + modFloat);
    }

    public static void prefixPostfixAndCompoundAssignmentOperators() {
        // prefix operators
        int someVal = 5;
        System.out.println("someVal (before): " + someVal);
        System.out.println("someVal (during): " + ++someVal);
        System.out.println("someVal (after): " + someVal);
        System.out.println();

        // postfix operators
        int otherVal = 5;
        System.out.println("otherVal (before): " + otherVal);
        System.out.println("otherVal (during): " + otherVal++);
        System.out.println("otherVal (after): " + otherVal);
        System.out.println();

        // compound assignment operators
        int myVal = 50;
        myVal -= 5;
        System.out.println("myVal: " + myVal);

        int other = 100;
        int val1 = 5;
        int val2 = 10;
        other /= val1 * val2;
        System.out.println("other: " + other);
    }

    public static void closerLookAtOperatorPrecedence() {
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;

        System.out.println(result1);
        System.out.println(result2);

        int result3 = valA / valC * valD + valB;
        int result4 = valA / (valC * (valD + valB));

        System.out.println(result3);
        System.out.println(result4);
    }
}
