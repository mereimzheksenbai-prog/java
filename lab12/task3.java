public class Task3 {
    public static void main(String[] args) {
        String text = "Бүгін зертханалық жұмысты орындаймыз";
        String[] words = text.split(" ");
        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length()) longest = w;
        }
        System.out.println("Ең ұзын сөз: " + longest);
    }
}