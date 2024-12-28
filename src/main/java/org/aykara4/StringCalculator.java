package org.aykara4;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public int add(String numbers) {
        if(numbers.isEmpty()) {
            return 0;
        }

        String delimiter = "[,\n]";
        if(numbers.startsWith("//")) {
            delimiter = numbers.substring(2, numbers.indexOf("\n"));
            numbers = numbers.substring(numbers.indexOf("\n")+1);
        }

        String[] integerArray = numbers.split(delimiter);
        List<Integer> negativeList = new ArrayList<>();
        int sum = 0;
        for(String number : integerArray) {
            int num = Integer.parseInt(number);
            if(num < 0) {
                negativeList.add(num);
            }
            sum += num;
        }
        if(!negativeList.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negativeList);
        }
        return sum;
    }

}