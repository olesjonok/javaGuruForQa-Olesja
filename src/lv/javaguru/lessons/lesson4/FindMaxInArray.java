package lv.javaguru.lessons.lesson4;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] array = {5, 123, 34, 2, 14, 5, 10};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("min = " + max);
    }
}
