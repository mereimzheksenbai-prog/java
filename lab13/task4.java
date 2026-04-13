import java.util.*;

class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String toString() {
        return name + " " + age + " " + grade;
    }
}

public class Task4 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 20, 85),
                new Student("Bob", 22, 75),
                new Student("Charlie", 21, 90)
        );

        students.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);
    }
}