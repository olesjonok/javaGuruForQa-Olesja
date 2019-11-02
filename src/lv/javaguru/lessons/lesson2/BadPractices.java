package lv.javaguru.lessons.lesson2;

public class BadPractices {
    public static void main(String[] args) {
        int x = 10;

        if (!(x > 5) || x == 10) {
            System.out.println("X > 5");
        } else {
            System.out.println("X <= 5");
        }
    }
}
