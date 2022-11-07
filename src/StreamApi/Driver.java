package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Driver {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("Adana");
        cityList.add("Amasya");
        cityList.add("Igdır");

        // Print the starts With A
        // BAD CODE
        cityList.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if (s.startsWith("A")){
                    return  true;
                }else
                    return true;
            }
        }).forEach(System.out::println);
        // Print the starts With A
        // NICE CODE
        cityList.stream().filter((s)->s.startsWith("A")).forEach(System.out::println);
        // Print to upper case
        cityList.stream().map((s)->s.toUpperCase()).forEach(System.out::println);
        // Print to 1-101
        IntStream.range(1,101).forEach(System.out::println);
        // Calculate the sum
        int sum = IntStream.range(1,101).sum();
        System.out.println(sum);
        // Array to stream then calculate the sum
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        int sum2 = Arrays.stream(intArray).sum();
        System.out.println(sum2);
        // String array to int array
        String[] number = {"1","2","3","4","5","6","7","8","9","10"};
        IntStream a = Stream.of(number).mapToInt(Integer::parseInt);
        a.forEach(System.out::println);
        // Finding max in String array
        Stream.of(number).mapToInt(Integer::parseInt).max().ifPresent(System.out::println);
        // int array to String array
        String[] strArray = Arrays.stream(intArray)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        String letter =Stream.of(strArray).reduce("",String::concat);
        System.out.println(letter);
        // 1,2,3,4,...10 ---> 1a,2a,3a,4a,...10a
        IntStream.range(1,11).mapToObj((s)->s+"a").forEach(System.out::println);
        // Finding value in stream
        Boolean isValid = Stream.of(strArray).anyMatch((s)->s.equals("50"));
        System.out.println(isValid);





    }
}
