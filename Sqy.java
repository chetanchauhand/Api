//Square of numbers

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Sqy {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6);

        list.stream()
        .map(x -> x * x)
        .forEach(System.out::println);
    }
}
