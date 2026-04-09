import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> history = new ArrayList<>();
        history.add("10 + 5 = 15");
        history.add("20 * 3 = 60");

        System.out.println("Есептеу тарихы:");
        for (String record : history) {
            System.out.println(record);
        }
    }
}
