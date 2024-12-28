package org.aykara4;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public int add(String numbers) {
        // to handle empty string input case
        if(numbers.isEmpty()) {
            return 0;
        }

        // default delimiter
        String delimiter = "[,\n]";

        // to handle custom delimiter cases
        if(numbers.startsWith("//")) {
            delimiter = "\\" + numbers.substring(2, numbers.indexOf("\n"));
            numbers = numbers.substring(numbers.indexOf("\n")+1);
        }

        // addition implementation
        return calculate(numbers, delimiter);
    }

    private int calculate(String numbers, String delimiter) {
        int sum = 0;
        List<Integer> negativeList = new ArrayList<>();
        String[] integerArray = numbers.split(delimiter);

        for(String number : integerArray) {
            int num = Integer.parseInt(number);
            if(num < 0) {
                negativeList.add(num);
            }
            sum += num;
        }

        // to handle input with negative numbers
        if(!negativeList.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negativeList);
        }
        return sum;
    }

}