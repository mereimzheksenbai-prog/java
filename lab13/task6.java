import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 8);

        int min = list.stream()
                .min(Integer::compare)
                .orElse(0);

        System.out.println(min);
    }
}