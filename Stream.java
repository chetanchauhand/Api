import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40);
        list.stream().forEach( x -> System.out.print(x));
    }
}
