package lv.javaguru.lessons.lesson4;

import java.util.Random;

public class RandomNumbersArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Random randomGenerator = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerator.nextInt();
        }

        for (int number : numbers) {
            System.out.println(number + " ");
        }
    }
}
