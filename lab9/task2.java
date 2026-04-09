class Student {
    String name;
    static String university = "ҚазҰУ";

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Аты: " + name + ", Университет: " + university);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ермек");
        s1.display();
    }
}
