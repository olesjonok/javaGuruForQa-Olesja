package lv.javaguru.lessons.lesson1;

import java.util.OptionalInt;

public class Level1 {
    public static void main(String[] args) {
        int numberOne = 32;
        int numberTwo = 8;

        int multiplyNumbers = numberOne * numberTwo;
        System.out.println("32*8 = "+ multiplyNumbers);
        int divideNumbers = numberOne/numberTwo;
        System.out.println("32/8 = " + divideNumbers);
        int sumNumbers = numberOne + numberTwo;
        System.out.println("32+8 = " + sumNumbers);
        int substractNumbers = numberOne - numberTwo;
        System.out.println("32-8 = " + substractNumbers);
    }
}
