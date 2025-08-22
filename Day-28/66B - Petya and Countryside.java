import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        
        int maxWatered = 0;
        for (int i = 0; i < n; i++) {
            int count = 1;
            // Check left side
            for (int j = i - 1; j >= 0; j--) {
                if (heights[j] <= heights[j+1]) {
                    count++;
                } else {
                    break;
                }
            }
            // Check right side
            for (int j = i + 1; j < n; j++) {
                if (heights[j] <= heights[j-1]) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > maxWatered) {
                maxWatered = count;
            }
        }
        System.out.println(maxWatered);
    }
}
