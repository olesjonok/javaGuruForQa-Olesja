package lv.javaguru.lessons.lesson3;

public class PowerCalculator {
    static int pow (int number, int power) {
        int result = 1;

        if (number >= 0) {
            for (int a = 1; a <= power; a++) {
                result = result * number;
            }
        }

        return result;
    }
}

