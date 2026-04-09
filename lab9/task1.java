package lab9;

public class task1 {
}

class git Student {
    String name;
    int age;
    static int count = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Али", 20);
        Student s2 = new Student("Айгерім", 19);
        System.out.println("Студенттер саны: " + Student.count);
    }
}
