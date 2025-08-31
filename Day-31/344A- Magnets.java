import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String prev = scanner.next();
        int groups = 1;
        for (int i = 1; i < n; i++) {
            String current = scanner.next();
            if (prev.charAt(1) == current.charAt(0)) {
                groups++;
            }
            prev = current;
        }
        System.out.println(groups);
    }
}
