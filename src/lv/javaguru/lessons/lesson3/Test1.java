package lv.javaguru.lessons.lesson3;

public class Test1 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.print("i = " + i + "; " );
            i++;
        }
        System.out.println(" ");
        for (int j = 0; j < 15; j++) {
            System.out.print("j = " + j + "; ");
        }
        System.out.println(" ");
        int k = 0;
        do {
            System.out.print("k = " + k + "; ");
            k++;
        } while (k < 5) ;
        System.out.println(" ");
        for (int m = 0; m < 10; m++) {
            if (m % 2 != 0) {
                System.out.print("m = " + m + "; ");
            }

        }
    }
}
