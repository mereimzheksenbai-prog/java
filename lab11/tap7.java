public class Task7 {
    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Бұл мәтін жоғары кетеді...");
        clearScreen();
        System.out.println("Экран тазартылды!");
    }
}