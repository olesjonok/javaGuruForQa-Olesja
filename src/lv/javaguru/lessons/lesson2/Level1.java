package lv.javaguru.lessons.lesson2;

public class Level1 {
    public static void main(String[] args) {

        int a = 4;
        System.out.println("a = " + a);
        int b = 5;
        System.out.println("b = " +b);
        boolean isGreater = a > b;
        if (isGreater) {
            System.out.println("True is a > b " + "or " + a + " > " + b);
        } else {
            System.out.println("True is b > a " + "or " + b + " > " + a);
        }
        System.out.println("----------");

        int c = 5;
        System.out.println("a = " + c);
        int d = 4;
        System.out.println("b = " + d);
        boolean isLess = c < d;
        if (isLess) {
            System.out.println("True is a < b " + "or " + c + " < " + d);
        } else {
            System.out.println("True is b < a " + "or " + d + " < " + c);
        }
        System.out.println("----------");

        int e = 1;
        System.out.println("a = " + e);
        int f = 6;
        System.out.println("a = " + f);
        boolean isEqual = e == f;
        if (isEqual) {
            System.out.println("True is a = b " + "or " + e + " == " + f);
        } else {
            System.out.println("True is a != b " + "or " + e + " != " + f);
        }
        System.out.println("----------");

        int g = 2;
        System.out.println("a = " + g);
        int i = 5;
        System.out.println("b = " + i);
        boolean isGreaterOrEqual = g >= i;
        if (isGreaterOrEqual) {
            System.out.println("True is a >= b " + "or " + g + " >= " + i);
        } else {
            System.out.println("True is b >= a " + "or " + i + " >= " + g);
        }
        System.out.println("----------");

        int j = 9;
        System.out.println("a = " + j);
        int k = 5;
        System.out.println("b = " + k);
        boolean isLessOrEqual = j <= k;
        if (isLessOrEqual) {
            System.out.println("True is a <= b " + "or " + j + " <= " + k);
        } else {
            System.out.println("True is b <= a " + "or " + k + " <= " + j);
        }
        System.out.println("----------");

        int l = 5;
        System.out.println("a = " + l);
        int n = 5;
        System.out.println("b = " + n);
        boolean isNotEqual = l != n;
        if (isNotEqual) {
            System.out.println("True is a != b " + "or " + l + " != " + n);
        } else {
            System.out.println("True is a = b " + "or " + l + " = " + n);
        }
        System.out.println("----------");

    }
}
