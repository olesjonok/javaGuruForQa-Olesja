package lv.javaguru.lessons.lesson3;

public class Number1to100 {
    public static void main(String[] args) {
        int a = 0;
        while (a <= 100) {
            System.out.println("a = " + a + "; ");
            a++;
        }

        for (int b = 0; b < 101; b++) {
            System.out.println("b = " + b + "; ");
        }
    }
}
