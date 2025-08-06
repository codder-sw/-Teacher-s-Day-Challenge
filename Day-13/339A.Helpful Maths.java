import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] parts = s.split("\\+");
        int[] numbers = new int[parts.length];
        
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
        
        Arrays.sort(numbers);
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (i != 0) {
                result.append("+");
            }
            result.append(numbers[i]);
        }
        
        System.out.println(result.toString());
    }
}
