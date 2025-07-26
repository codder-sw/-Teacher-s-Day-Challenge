class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int count = 0;

        for (int num : nums) {
            int digits = 0;
            int temp = num;

            // Count number of digits in num
            while (temp > 0) {
                temp /= 10;
                digits++;
            }

            // Check if digit count is even
            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
};
