package lv.javaguru.lessons.lesson4;

import java.util.Random;

public class FirstNumberInArrayIsHigher {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Random randomGenerator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerator.nextInt(30);
        }
        for (int number : numbers) {
            System.out.println(number + " ");
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);

    }
}
