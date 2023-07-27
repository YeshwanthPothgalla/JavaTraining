package jobTraining;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NamesArray {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        String[] names = {"ram", "sita", "hanuma"};
//        IntStream.range(0, names.length).forEach(i->{
//            System.out.println(names[i]);
//        });
//        String[] fruits = {"Banana", "Apple", "Mango"};
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }
        String[] animals = {"dogs", "cats","monkey"};
        Arrays.stream(animals).forEach(animal->{
            System.out.println(animal);
        });
    }
}
