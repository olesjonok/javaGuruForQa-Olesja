package lv.javaguru.lessons.lesson3;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculator service = new PowerCalculator();
        int actualResult = service.pow(-3, 2);
        int expected = 9;

        if (actualResult == expected) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
