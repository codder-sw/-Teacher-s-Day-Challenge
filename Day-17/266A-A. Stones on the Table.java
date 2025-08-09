import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int count = 0;
        
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
