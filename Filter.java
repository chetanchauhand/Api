import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,3,4,5,6);

        list.stream()
        .filter(x -> x%2==0)
        .forEach(System.out::println);
    }
}
