import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        String reversed_s = new StringBuilder(s).reverse().toString();
        System.out.println(reversed_s.equals(t) ? "YES" : "NO");
    }
}
