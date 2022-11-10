package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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


        List<Integer> list2 = Arrays.asList(7,52,43,785,1,2,12,2,4,45,52);
        // Display

        list2.stream().forEach(System.out::println);

        // Count of list

        int count = (int)list2.stream().count();
        System.out.println("Count: "+ count );

        //sort small to high
        List<Integer> list3 = list2.stream().sorted().collect(Collectors.toList());
        list3.stream().forEach(System.out::println);

        //sort reverse
        List<Integer> list4 = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        list4.stream().forEach(System.out::println);
        // Display odd numbers
        List<Integer> list5 = list2.stream().filter(x -> x %2 ==0).sorted().collect(Collectors.toList());
        list5.stream().forEach(System.out::println);


        // Add all numbers by 1
        List<Integer> list6 = list2.stream().sorted().map(x -> x+1).collect(Collectors.toList());
        list6.stream().forEach(System.out::println);
        System.out.println("555555555555555");
        // Find the repeat numbers
        List<Integer> nonRepeatNumbers =list2.stream().distinct().collect(Collectors.toList());

        List<Integer> RepeatedNumbers =nonRepeatNumbers.stream().filter(x-> !list2.contains(x)).collect(Collectors.toList());


        RepeatedNumbers.stream().forEach(System.out::println);


        // Calculate sum of list

        int sumList =list2.stream().reduce(0,(z1,z3)-> {return z1+z3;} );
        System.out.println(a);
        // Add 2 oll numbers and find the fourth numbers





        //Lambda
        //countries.forEach(x->{
        //     System.out.println(x.toUpperCase());
        // });
        // One sentence print
        // countries.forEach(System.out::println);

        //Stream





    }
}
