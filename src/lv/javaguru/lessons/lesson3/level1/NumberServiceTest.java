package lv.javaguru.lessons.lesson3.level1;

public class NumberServiceTest {
    public static void main(String[] args) {
        NumberService service = new NumberService();
        int actualResult = service.sumInRange(1, 4);
        int expected = 10;

        if (actualResult == expected) {
            System.out.println("URA! Success!");
        } else {
            System.out.println("T_T Fail!!!");
        }
    }
}
