import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        if (word.length() == 0) {
            System.out.println(word);
        } else {
            String firstChar = word.substring(0, 1).toUpperCase();
            String rest = word.substring(1);
            System.out.println(firstChar + rest);
        }
    }
}
