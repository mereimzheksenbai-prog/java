import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Меню: 1-қосу, 2-азайту, 3-көбейту, 4-бөлу");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Қосу таңдалды");
            case 2 -> System.out.println("Азайту таңдалды");
            case 3 -> System.out.println("Көбейту таңдалды");
            case 4 -> System.out.println("Бөлу таңдалды");
            default -> System.out.println("Қате таңдау");
        }
    }
}
