class Solution {
public:
    int romanToInt(string s) {
        int values[256] = {0};
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;
        
        int total = 0;
        int prev_value = 0;
        
        for (char c : s) {
            int current_value = values[c];
            if (current_value > prev_value) {
                total += current_value - 2 * prev_value;
            } else {
                total += current_value;
            }
            prev_value = current_value;
        }
        
        return total;
    }
};
