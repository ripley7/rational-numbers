package org.ripley.numbers;

public class Main {

    public static void main(String[] args) {
        RationalNumber rational = new RationalNumber(35, 20);
        RationalNumber rational2 = new RationalNumber(10, 20);
        double value = rational.getDouble();
        double value2 = rational2.getDouble();

        // Show results
        System.out.printf("value: %f %n", value);
        System.out.printf("value2: %f %n", value2);
        System.out.printf("Numerator1: %d %n", rational.getNumerator());
        System.out.printf("Denominator1: %d %n", rational.getDenominator());
        System.out.printf("Numerator2: %d %n", rational2.getNumerator());
        System.out.printf("Denominator2: %d %n", rational2.getDenominator());
        System.out.printf("Add value and value2: %f%n", rational.add(rational2).getDouble());
        System.out.printf("Multiply value and value2: %f%n", rational.multiply(rational2).getDouble());
    }
}
