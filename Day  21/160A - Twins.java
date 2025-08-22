import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] coins = new Integer[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        Arrays.sort(coins, Collections.reverseOrder());
        int total = 0;
        for (int coin : coins) {
            total += coin;
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum += coins[i];
            count++;
            if (sum > total - sum) {
                break;
            }
        }
        System.out.println(count);
    }
}
