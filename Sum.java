import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40);

        int Sum = list.stream()
        .mapToInt(Integer::intValue)
        .sum();

        System.out.println(Sum);
    }
}
