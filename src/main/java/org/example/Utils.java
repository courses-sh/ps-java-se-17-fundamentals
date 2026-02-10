package org.example;


import org.example.calcengine.CalcEngine;
import org.example.classes.UnderstandingClassesObjects;
import org.example.conditionals.Conditionals;
import org.example.looping.Looping;
import org.example.methods.ACloserLookAtMethods;
import org.example.methods.DeclaringAndCallingMethods;
import org.example.strings.WorkingWithStrings;
import org.example.variables.Variables;
import org.example.wrappers.FlightCrewJob;
import org.example.wrappers.WrapperClassesEnumsRecords;

public class Utils {
    public static void runLesson(Lessons lesson) {
        switch (lesson) {
            case VARIABLES:
                // 03 - Variables, Data Types, and Math Operators
                Variables.variables();
                Variables.primitiveDataTypesIntegers();
                Variables.primitiveDataTypesFloatsAndDoubles();
                Variables.primitiveDataTypesCharactersAndBooleans();
                Variables.arithmeticOperators();
                Variables.prefixPostfixAndCompoundAssignmentOperators();
                Variables.closerLookAtOperatorPrecedence();
                break;
            case CONDITIONALS:
                // 04 - Conditional Logic and Block Statements
                Conditionals.conditionalLogic();
                Conditionals.logicalVsConditional();
                Conditionals.blockStatements();
                break;
            case LOOPS:
                // 05 - Looping and Arrays
                Looping.whileLoop();
                Looping.dowWileLoop();
                Looping.forLoop();
                Looping.arrays();
                break;
            case METHODS:
                // 06 - Understanding Methods
                DeclaringAndCallingMethods.doSomething();
                DeclaringAndCallingMethods.showSum(1.2F, 3.4F, 3);
                break;
            case STRINGS:
                // 07 - Working with Strings
                WorkingWithStrings.stringBuilder();
                break;
            case OOP:
                // 08 - Understanding Classes and Objects
                UnderstandingClassesObjects.declaringClasses();
                break;
            case METHODS_CLOSER_LOOK:
                // 11 - A Closer Look at Methods
                ACloserLookAtMethods.overridingObjectEquality();
                break;
            case WRAPPER_CLASS__ENUMS__RECORDS:
                // 12 - Working with Wrapper Classes, Enums, and Records
                WrapperClassesEnumsRecords.understandingEnums();

                FlightCrewJob job = FlightCrewJob.FLIGHT_ATTENDANT;
                WrapperClassesEnumsRecords.displayJobResponsibilities(job);

                WrapperClassesEnumsRecords.enumsRelativeComparison();
                WrapperClassesEnumsRecords.workingWithRecords();
                break;
            case EXERCISE:
                // Exercise
                // Run: `java org/example/Main.java add 2000 300`
                String[] cmd = new String[]{"interactive"};
                CalcEngine.engine(cmd);
        }
    }
}
