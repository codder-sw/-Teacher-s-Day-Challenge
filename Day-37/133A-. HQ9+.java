import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (c == 'H' || c == 'Q' || c == '9') {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
