package lv.javaguru.lessons.lesson4;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class ArrayService {
    int[] create = new int[10];

    Random fillArrayWithRandomNumbers = new Random();
    int number = fillArrayWithRandomNumbers.nextInt(101);
}
//    public int[] create (int n) {
//        int [] arrCreate = new int [n];
//        return arrCreate;
//    }
//    public int [] fillArrayWithRandomNumbers(int [] array){
//
//        for(int i=0;i<array.length;i++){
//
//        }
//        return array;
//    }
//   create(6); //sozdan massiv iz 6 argumentov
//  fillArrayWithRandomNumbers(arrCreate);//zapolnaeshj massiv randomnim chislami

