import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        list.stream()
                .map(x -> x * 2)
                .forEach(System.out::println);
    }
}