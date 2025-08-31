import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] points = new int[n];
        for (int i = 0; i < n; i++) {
            points[i] = scanner.nextInt();
        }
        int count = 0;
        int max = points[0];
        int min = points[0];
        for (int i = 1; i < n; i++) {
            if (points[i] > max) {
                count++;
                max = points[i];
            } else if (points[i] < min) {
                count++;
                min = points[i];
            }
        }
        System.out.println(count);
    }
}
