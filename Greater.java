//Greater then 10

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class Greater {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,10,15,20);

        list.stream()
        .filter(x -> x>10)
        .forEach(System.out::println);
    }
}
