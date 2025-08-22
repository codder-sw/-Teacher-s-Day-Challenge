import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        
        while (t-- > 0) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 'B' && arr[i+1] == 'G') {
                    // Swap
                    char temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    i++; // Skip the next position
                }
            }
        }
        System.out.println(new String(arr));
    }
}
