package lv.javaguru.lessons.lesson2;

public class Test {
    public static void main(String[] args) {
        int x = 5;
        if (x>10) {
            System.out.println("x>10");
        } else {
            System.out.println("x<10");
        }

        boolean flag = false;
        if (flag) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        boolean cat1 = false;
        boolean cat2 = true;
        if (cat1) {
            System.out.print("flag1");
        } else if (cat2) {
            System.out.print("flag2");
        }

        int a = 7;
        if (a == 3) {
            System.out.print("a == 3");
        } else if (a == 7) {
            System.out.print("a == 7");
        }
    }

}
