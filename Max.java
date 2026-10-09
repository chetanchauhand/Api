//Maximum

import java.util.Arrays;
import java.util.List;

public class Max {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,40,30,50,12);

        int Max = list.stream()
        .max(Integer::compareTo)
        .get();

        System.out.println(Max);
    }
}
