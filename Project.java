import java.util.*;
import java.util.stream.*;

public class Project {
    


    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(
            85, 32, 90, 45, 76, 28, 95, 67
        );

        // 1. Passing students (marks >= 40)
        List<Integer> pass = marks.stream()
            .filter(m -> m >= 40)
            .collect(Collectors.toList());

        System.out.println("Passing Marks: " + pass);

        // 2. Sort marks in descending order
        List<Integer> sorted = marks.stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());

        System.out.println("Rank List: " + sorted);

        // 3. Find toppers (marks >= 80)
        List<Integer> toppers = marks.stream()
            .filter(m -> m >= 80)
            .collect(Collectors.toList());

        System.out.println("Toppers: " + toppers);

        // 4. Add 5 grace marks
        List<Integer> updated = marks.stream()
            .map(m -> m + 5)
            .collect(Collectors.toList());

        System.out.println("Updated Marks: " + updated);

        // 5. Calculate average marks
        double average = marks.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0);

        System.out.println("Average Marks: " + average);
    }
}

