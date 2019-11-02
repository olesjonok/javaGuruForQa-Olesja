package lv.javaguru.lessons.lesson3;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int computerNumber;
        int userNumber;
        Scanner input = new Scanner(System.in);

        computerNumber = (int) (Math.random() * 100);
  //      System.out.println(computerNumber);
        do {
            System.out.print("Введи число: ");

            userNumber = input.nextInt();

            if (userNumber > computerNumber)
                System.out.println("Загаданное число меньше.");

            else if (userNumber < computerNumber)
                System.out.println("Загаданное число больше.");

            else
                System.out.println("Угадали!");

        } while (userNumber != computerNumber);

    }
}
