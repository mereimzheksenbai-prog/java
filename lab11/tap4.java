import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Сан енгізіңіз: ");
            int num = sc.nextInt();
            System.out.println("Сіз енгізген сан: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Қате! Тек бүтін сан енгізу керек.");
        }
    }
}
