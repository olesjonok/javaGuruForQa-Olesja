package lv.javaguru.lessons.lesson4;

import java.util.Random;

public class FindMinInArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Random randomGenerator = new Random();
        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = randomGenerator.nextInt(101);
        }
        for (int number : numbers) {
            System.out.println(number + " ");
        }
        //      for (int i = 0; i < numbers.length; i++) {
        //          int number = numbers[i];
        //          System.out.println((number + " "));
        //     }
        System.out.println();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            System.out.println("min = " + min);
        }

    }
}
