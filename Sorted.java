//Sort

import java.util.Arrays;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,40,12,12,34,11,34);

        list.stream()
        .sorted()
        .forEach(System.out::println);
    }
}
