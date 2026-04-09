package lab9;

public class task8 {
}

class University {
    class Student {
        String name, major;

        Student(String name, String major) {
            this.name = name;
            this.major = major;
        }

        void display() {
            System.out.println("Аты: " + name + ", Мамандығы: " + major);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        University u = new University();
        University.Student s = u.new Student("Айбек", "Информатика");
        s.display();
    }
}
