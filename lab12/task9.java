public class Task9 {
    public static void main(String[] args) {
        String text = "Internship";
        String result = text.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("Нәтиже: " + result);
    }
}