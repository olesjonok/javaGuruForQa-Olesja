package lv.javaguru.lessons.lesson2;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число номер 1:");
        int number1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите число номер 2:");
        int number2 = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите число номер 3:");
        int number3 = sc3.nextInt();

        if(number1 >= number2 && number1 >= number3) {
            System.out.println("самое большое число : " + number1);
        } else if(number2 >= number1 && number2 >= number3) {
            System.out.println("самое большое число : " + number2);
        } else if(number3 >= number1 && number3 >= number2) {
            System.out.println("самое большое число : " + number3);
        }
        if(number1 == number2 && number2 == number3) {
            System.out.println("все числа равны: " + number1 + " == " + number2 + " == " + number3);
        }
    }
}
