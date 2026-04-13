import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 15, 20, 3);

        list.stream()
                .filter(x -> x > 10)
                .forEach(System.out::println);
    }
}