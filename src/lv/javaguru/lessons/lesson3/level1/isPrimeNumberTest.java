package lv.javaguru.lessons.lesson3.level1;

public class isPrimeNumberTest {
    public static void main(String[] args) {
        NumberService service = new NumberService();

        int sum = 0;
        int count = 0;
        for (int number = 2; number >= 500; number++) {
            if (number == 17 || number == 71) {
                continue;
            }
            if (count == 50) {
                break;
            }
            if (service.isPrimeNumber(number)) {
                count++;
                sum = sum +number;
            }
        }
        System.out.println("count = " + count);
        System.out.println("sum = " + sum);
    }
}
