package lv.javaguru.lessons.lesson3.level1;

public class EvenNumberCounterTest {
    public static void main(String[] args) {
        EvenNumberCounter service = new EvenNumberCounter();
        int actualResult = service.getEvenNumberCount(1, 8);
        int expected = 3;

        if (actualResult == expected) {
            System.out.println("URA! Success!");
        } else {
            System.out.println("T_T Fail!!!");
        }
    }
}
