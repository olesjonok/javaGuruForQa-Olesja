package lv.javaguru.lessons.lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessUserNumber {
    public static void main(String[] args) {
        System.out.println("Загадайте число от 1 до 100");
        System.out.println("Введите 'Ok', чтобы начать : ");

        int MIN = 0;
        int MAX = 100;

        Random r = new Random();
        int ranNumber = 0;

        int tmin = MIN;
        int tmax = MAX;

        Scanner sc = new Scanner(System.in);
        boolean win = false;

        while (!win) {
            String command = sc.nextLine().toUpperCase();
            switch (command) {
                case "OK":
                    ranNumber = r.nextInt(MAX - MIN + 1) + MIN;
                    System.out.println(ranNumber);
                    break;
                case "WIN":
                    win = true;
                    break;
                case ">":
                    tmin = ranNumber;
                    ranNumber = ranNumber + (tmax - tmin) / 2;
                    System.out.println(ranNumber);
                    break;
                case "<":
                    tmax = ranNumber;
                    ranNumber = ranNumber - (tmax - tmin) / 2;
                    System.out.println(ranNumber);
                    break;
            }
        }
        System.out.println("Правильно!");
    }
}