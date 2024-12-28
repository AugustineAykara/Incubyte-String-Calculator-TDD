package org.aykara4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    void test_AddEmptyString_ReturnZero() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""), "Adding an empty string should return 0");
    }

    @Test
    void test_AddSingleInteger_ReturnInteger() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(5, calculator.add("5"), "Adding a single integer should return the same number itself");
    }

    @Test
    void test_AddSingleNegativeInteger_ReturnExceptionMessage() {
        StringCalculator calculator = new StringCalculator();
        try {
            int sum = calculator.add("-10");
        } catch (IllegalArgumentException e) {
            assertEquals("Negative numbers not allowed: -10", e.getMessage(), "Adding a single negative integer should return exception message 'negative numbers not allowed <negative_number>'");
        }
    }

}