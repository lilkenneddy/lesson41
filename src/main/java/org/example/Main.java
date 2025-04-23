package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        int sumOfNumbers = sumNumbers(numbers);
        System.out.println("список: " + numbers);
        System.out.println("сума: " + sumOfNumbers);
    }

    private static int sumNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}




