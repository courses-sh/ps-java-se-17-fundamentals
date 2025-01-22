package org.example.calcengine;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public void setLeftVal(double val) {
        this.leftVal = val;
    }

    public double getLeftVal() {
        return leftVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public MathEquation() {
    }

    public MathEquation(char opCode) {
        this.setOpCode(opCode);
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.setLeftVal(leftVal);
        this.setRightVal(rightVal);
    }

    void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid optCode: " + opCode);
                result = 0.0d;
                break;
        }
    }
}
