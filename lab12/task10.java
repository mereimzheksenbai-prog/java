public class Task10 {
    public static void main(String[] args) {
        String text = "123456";
        boolean isOnlyDigits = text.matches("[0-9]+");
        System.out.println("Тек цифрлар ма? " + isOnlyDigits);
    }
}