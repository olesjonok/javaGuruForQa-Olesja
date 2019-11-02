package lv.javaguru.lessons.lesson4;

import java.util.Random;

public class HowManyEvenNumbersInArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Random randomGenerator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerator.nextInt();
        }

        int countEven = 0;
        int countOdd = 0;
        int notCorrect = 0;
        for (int number : numbers) {
            System.out.println(number + " ");

            if (number % 2 == 0) {
                countEven++;

            } else if (number % 2 != 0) {
                countOdd++;
            } else if (number == 0) {
                notCorrect++;
            }
        }
        System.out.println("Counter of even numbers = " + countEven);
        System.out.println("Counter of odd numbers = " + countOdd);
        System.out.println("Zero = " + notCorrect);
    }
}
