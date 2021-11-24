package ru.job4j.calculator;

public class Calculator {
    private  static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + this.multiply(y) + minus(y) + this.divide(y);
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        Calculator calculator = new Calculator();
        System.out.println(sum(5));
        System.out.println(calculator.multiply(2));
        System.out.println(minus(10));
        System.out.println(calculator.divide(2));
        System.out.println(calculator.sumAllOperation(5));
    }
}
