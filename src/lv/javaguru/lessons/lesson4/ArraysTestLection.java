package lv.javaguru.lessons.lesson4;

import java.util.Arrays;

public class ArraysTestLection {
    public static void main(String[] args) {
        int[] leapYears = new int[3];
        leapYears[0] = 2020;
        leapYears[1] = 2016;
        leapYears[2] = 2012;
        System.out.println("Leap years = " + Arrays.toString(leapYears));
    }
}
