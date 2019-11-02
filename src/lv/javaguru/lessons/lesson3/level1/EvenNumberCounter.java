package lv.javaguru.lessons.lesson3.level1;

public class EvenNumberCounter {
    public int getEvenNumberCount (int firstNumber, int secondNumber) {
        int evenNumberCounter = 0;
        while (firstNumber < secondNumber) {
            if (firstNumber % 2 == 0) {
                System.out.println("Number = " + firstNumber + ";");
                evenNumberCounter++;
            }
            firstNumber++;
        }
        return evenNumberCounter;
    }
}
