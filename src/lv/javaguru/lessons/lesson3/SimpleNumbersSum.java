package lv.javaguru.lessons.lesson3;


public class SimpleNumbersSum {
    public static void main(String[] args) {

        int i = 1;
        int counter = 0;
        int count = 0;
        int sum = 0;
        int b = 2;
        System.out.println("i = " + b);
        int c = 3;
        System.out.println("i = " + c);
        int d = 5;
        System.out.println("i = " + d);
        int e = 7;
        System.out.println("i = " + e);
        int g = 11;
        System.out.println("i = " + g);
        int k = 13;
        System.out.println("i = " + k);
        int m = 19;
        System.out.println("i = " + m);
        int notIncludedNumbers = 7;
        int NumberSum = b + c + d + e + g + k +  m;

        for (i = 12; i < 501; i++) {
            if ((i%2!=0) && (i%3!=0) && (i%5!=0) && (i%7!=0) && (i%11!=0) && (i!=17) && (i!=71) && (i%13!=0) && (i%19!=0) && (i%17!=0)) {
                if (count <= 1) {
                    System.out.println("i = " + i + "; ");
                    sum = sum + i;
                    counter++;
                }
                if (counter >= 43) {
                    break;
                }
            }
        }

        int sum2 = NumberSum + sum;
        System.out.println("sum = " + sum2);
        int counterSum = counter + notIncludedNumbers;
        System.out.println("count = " + counterSum);
    }
}