public class Task1 {
    public static void main(String[] args) {
        String text = "Java Programming";
        int vowels = 0, consonants = 0;
        String temp = text.toLowerCase();

        for (char c : temp.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Дауысты: " + vowels);
        System.out.println("Дауыссыз: " + consonants);
    }
}
