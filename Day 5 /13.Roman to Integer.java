class Solution {
    public int getRoman(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1; // invalid character
        }
    }

    public int romanToInt(String s) {
        int total = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {  // RIGHT to LEFT loop
            char ch = s.charAt(i);
            int cur = getRoman(ch);
            if (cur < prev) {
                total -= cur;
            } else {
                total += cur;
            }
            prev = cur;
        }
        return total;
    }
}
