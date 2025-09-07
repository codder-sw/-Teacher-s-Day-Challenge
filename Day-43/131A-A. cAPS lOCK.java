import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char[] chars = word.toCharArray();
        boolean allUpperExceptFirst = true;
        
        // Check if all characters except possibly the first are uppercase
        for (int i = 1; i < chars.length; i++) {
            if (!Character.isUpperCase(chars[i])) {
                allUpperExceptFirst = false;
                break;
            }
        }
        
        if (allUpperExceptFirst) {
            // Convert first character to uppercase and rest to lowercase
            if (Character.isLowerCase(chars[0])) {
                chars[0] = Character.toUpperCase(chars[0]);
                for (int i = 1; i < chars.length; i++) {
                    chars[i] = Character.toLowerCase(chars[i]);
                }
            } else {
                // First character is already uppercase, so convert all to lowercase
                for (int i = 0; i < chars.length; i++) {
                    chars[i] = Character.toLowerCase(chars[i]);
                }
            }
        } else {
            // Check if all characters are uppercase
            boolean allUpper = true;
            for (char c : chars) {
                if (!Character.isUpperCase(c)) {
                    allUpper = false;
                    break;
                }
            }
            if (allUpper) {
                for (int i = 0; i < chars.length; i++) {
                    chars[i] = Character.toLowerCase(chars[i]);
                }
            }
        }
        
        System.out.println(new String(chars));
        scanner.close();
    }
}
