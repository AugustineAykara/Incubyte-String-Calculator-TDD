package org.aykara4;

public class StringCalculator {

    public int add(String numbers) {
        if(numbers.isEmpty()) {
            return 0;
        }

        String[] integerArray = numbers.split("[,\n]");
        int sum = 0;
        for(String number : integerArray) {
            int num = Integer.parseInt(number);
            if(num < 0) {
                throw new IllegalArgumentException("Negative numbers not allowed: " + num);
            }
            sum += num;
        }
        return sum;
    }

}