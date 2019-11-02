package lv.javaguru.lessons.lesson1;

import java.util.Random;

public class RandomNumbersServiceTest {
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int a = randomGenerator.nextInt(10);
        int b = randomGenerator.nextInt(10);
        int c = randomGenerator.nextInt(10);
        int sumNumbers = a+b+c;
        System.out.println(a + "+" + b + "+" + c + "=" + sumNumbers);

    }
}


