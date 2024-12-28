package org.aykara4;

public class StringCalculator {

    public int add(String numbers) {
        if(numbers.isEmpty()) {
            return 0;
        } else if(numbers.contains(",")) {
         String[] integerArray = numbers.split(",");
         int sum = 0;
         for(String num : integerArray) {
             sum += Integer.parseInt(num);
         }
         return sum;
        }
        int num = Integer.parseInt(numbers);
        if(num < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + num);
        }
        return num;
    }

}