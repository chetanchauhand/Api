//Remove Duplicate Element

import java.util.Arrays;
import java.util.List;

public class Mains {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50,60);

        list.stream()
        .distinct()
        .forEach(System.out::println);
    }
}
