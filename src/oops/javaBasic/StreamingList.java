package src.oops.javaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamingList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>(Arrays.asList("Aarush", "Raj", "Palak"));
        names.stream().map(e->e+" new Name").forEach(System.out::println);
        System.out.println(names.get(0));
        names.stream().filter(e ->e.equals("Raj")).forEach(System.out::println);


        int myArray[] = { 1, 5, 8 };
        int sum = Arrays.stream(myArray).sum();
        List<Integer> rollnumbers = new ArrayList<Integer>(Arrays.asList(1,3,4,2,4));
//        int sum2 = rollnumbers.stream().min();
        String[] myArray2 = { "this", "is", "a", "sentence" };
        Integer result = Arrays.stream(myArray)
                .reduce(4, (a,b) -> a + b);
        System.out.println(result);
    }
}
