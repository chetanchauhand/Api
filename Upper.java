// convert Uppercase

import java.util.Arrays;
import java.util.List;

public class Upper {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aman","prince","rahul","shivam");
        list.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);
    }
}
