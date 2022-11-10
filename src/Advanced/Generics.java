package Advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        Character[] characterArray = {'c','s','a','v'};
        String[] stringArray = {"META-INF","Java201.java","Java101"};
        Integer[] integerArray = {2,3,4,4};
        List<Character> list = Arrays.asList(characterArray);
        list.stream().forEach(System.out::println);
    }

    public static <T> List<T> arrayToList(T[] array){
        List<T> list = new ArrayList<>();
        for (T x: array) {
            list.add(x);
        }
        return list;
    }
}
