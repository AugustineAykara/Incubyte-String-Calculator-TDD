package org.aykara4;

public class StringCalculator {

    public int add(String numbers) {
        if(numbers.isEmpty()) {
            return 0;
        }
        int num = Integer.parseInt(numbers);
        if(num < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + num);
        }
        return num;
    }

}