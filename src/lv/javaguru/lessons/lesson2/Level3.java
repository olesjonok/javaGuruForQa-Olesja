package lv.javaguru.lessons.lesson2;

import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("axx+2bx+c=0");
        System.out.println("Введите число номер a:");
        int number1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите число номер b:");
        int number2 = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите число номер c:");
        int number3 = sc3.nextInt();

         //a*x*x+2*b*x+c=0
         //D=b*b-4*a*c
         int d = number2 * number2 - 4 * number1 * number3;
         System.out.println("D = " + d);

        double sqrtD = Math.sqrt(d);
        if(d > 0) {
            double x1 = (- number2 + sqrtD) / 2 * number1;
            double x2 = (- number2 - sqrtD) / 2 * number1;
            System.out.println("x1 = " + x1 + "; x2 = " + x2);
        } else if(d == 0) {
            double x3 = - number2 / 2 * number1;
            System.out.println("x = " + x3);
        } else if(d < 0) {
            System.out.println("корней на множестве действительных чисел нет");
        }

    }
}
