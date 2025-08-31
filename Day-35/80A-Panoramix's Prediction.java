import java.util.Scanner;

public class Main {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (!isPrime(m)) {
            System.out.println("NO");
            return;
        }
        for (int i = n + 1; i < m; i++) {
            if (isPrime(i)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
