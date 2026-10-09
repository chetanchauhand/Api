//Count

import java.util.Arrays;
import java.util.List;

public class Cout {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","C++","c","PHP");
        long Count = list.stream().count();
        System.out.println(Count);
    }
}
