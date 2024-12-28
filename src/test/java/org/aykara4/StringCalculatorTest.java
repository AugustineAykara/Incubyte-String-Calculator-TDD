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
            assertEquals("Negative numbers not allowed: [-10]", e.getMessage(), "Adding a single negative integer should return exception message 'negative numbers not allowed <negative_number>'");
        }
    }

    @Test
    void test_AddDoubleInteger_ReturnSumOfInteger() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(15, calculator.add("5,10"), "Adding two numbers should return their sum");
    }

    @Test
    void test_AddMultipleInteger_ReturnSumOfInteger() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(30, calculator.add("5,10,15"), "Adding multiple numbers should return their sum");
    }

    @Test
    void test_AddMultipleInteger_WithNewLineDelimiter_ReturnSumOfInteger() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(30, calculator.add("5\n10,15"), "Adding multiple numbers with new line delimiter should return their sum");
    }

    @Test
    void test_AddMultipleInteger_WithNewLineDelimiter_WithNegativeNumber_ReturnExceptionListingOutNegativeNumbers() {
        StringCalculator calculator = new StringCalculator();
        try {
            int sum = calculator.add("5\n10,-15,20,-10");
        } catch (IllegalArgumentException e) {
            assertEquals("Negative numbers not allowed: [-15, -10]", e.getMessage(), "Adding a negative integer should return exception message 'negative numbers not allowed <negative_number>'");
        }

    }

}