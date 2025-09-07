import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }
        
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for (int num : heights) {
            if (num > maxVal) maxVal = num;
            if (num < minVal) minVal = num;
        }
        
        int maxIndex = -1;
        for (int i = 0; i < n; i++) {
            if (heights[i] == maxVal) {
                maxIndex = i;
                break;
            }
        }
        
        int minIndex = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (heights[i] == minVal) {
                minIndex = i;
                break;
            }
        }
        
        int swaps = maxIndex + (n - 1 - minIndex);
        if (maxIndex > minIndex) {
            swaps--;
        }
        
        System.out.println(swaps);
        scanner.close();
    }
}
