package org.ripley.numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RationalNumberTest {
    private RationalNumber rational;
    private RationalNumber rational2;

    @Before
    public void setUp() {
        rational = new RationalNumber(5, 10);
        rational2 = new RationalNumber(10, 20);
    }

    @Test
    public void testGetDouble() {
        assertEquals(0.5, rational.getDouble(), 0);
    }

    @Test
    public void testAdd() {
        rational = rational.add(rational2);
        assertEquals(1, rational.getDouble(), 0);
        assertEquals(1, rational.getNumerator());
        assertEquals(1, rational.getDenominator());
    }

    @Test
    public void testMultiply() {
        rational = rational.multiply(rational2);
        assertEquals(0.25, rational.getDouble(), 0);
        assertEquals(1, rational.getNumerator());
        assertEquals(4, rational.getDenominator());
    }
}
