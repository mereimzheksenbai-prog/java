public class lab2 {
}
public class Student {
    String name = "Мерейім";

    public static void main(String[] args) {
        Uniber u = new Uniber();
        System.out.println("Студент: " + u.name);
        System.out.println("Университет: " + u.univerName);
        System.out.println("Кафедра: " + u.kafName);
    }
}

class Kafedra {
    String kafName = "Ақпараттық технологиялар";
}

class Uniber extends Kafedra { // uniber класы kafedra-дан мұра алады
    String univerName = "АТУ";
    String name = "Мерейім"; // Student қасиетін қолдану үшін
}

