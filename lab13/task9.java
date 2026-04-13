import java.util.*;
        import java.util.stream.Collectors;

class Student2 {
    String name;
    int age;

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name;
    }
}

public class Task9 {
    public static void main(String[] args) {
        List<Student2> students = Arrays.asList(
                new Student2("Alice", 20),
                new Student2("Bob", 20),
                new Student2("Charlie", 21)
        );

        Map<Integer, List<Student2>> grouped =
                students.stream()
                        .collect(Collectors.groupingBy(s -> s.age));

        System.out.println(grouped);
    }
}