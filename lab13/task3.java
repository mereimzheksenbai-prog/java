import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 9, 1);

        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}