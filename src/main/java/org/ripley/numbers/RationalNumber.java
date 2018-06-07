package org.ripley.numbers;

public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            denominator = 1;
        }

        // Insure numerator stores sign
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }

        this.denominator = denominator;
        this.numerator = numerator;
        reduce();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double getDouble() {
        return (double) numerator / (double) denominator;
    }

    public RationalNumber add(RationalNumber rational) {
        int commonDenominator = denominator * rational.getDenominator();
        int num1 = numerator * rational.getDenominator();
        int num2 = rational.getNumerator() * denominator;
        int sum = num1 + num2;
        return new RationalNumber(sum, commonDenominator);
    }

    public RationalNumber multiply(RationalNumber rational) {
        int numerator = this.numerator * rational.getNumerator();
        int denominator = this.denominator * rational.getDenominator();
        return new RationalNumber(numerator, denominator);
    }

    // Euclid's Algorithm; apply within class as utility
    private int getGreatestCommonDiv(int a, int b) {
        if (a == b) {
            return a;
        } else if (a < b) {
            return getGreatestCommonDiv(a, b - a);
        } else {
            return getGreatestCommonDiv(a - b, b);
        }
    }

    // reduce number by greatest common divisor (divide both numerator and
    // denominator by GCD)
    private void reduce() {
        int common = getGreatestCommonDiv(Math.abs(numerator), denominator);
        if (common > 0) {
            numerator = numerator / common;
            denominator = denominator / common;
        }
    }
}
