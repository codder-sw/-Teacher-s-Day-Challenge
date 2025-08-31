import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] luckyNumbers = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        for (int num : luckyNumbers) {
            if (n % num == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
