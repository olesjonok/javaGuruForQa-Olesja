package lv.javaguru.lessons.lesson4;

public class ForEachDemo {
    public static void main(String[] args) {
        String[] dogBreeds = {
                "Beagle",
                "Golden Retriever",
                "Pug",
                "Shiba Inu"
        };
        for (String breed : dogBreeds) {
            System.out.println(breed);
        }
    }
}
