#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> heights(n);
    for (int i = 0; i < n; i++) {
        cin >> heights[i];
    }
    
    int max_val = *max_element(heights.begin(), heights.end());
    int min_val = *min_element(heights.begin(), heights.end());
    
    int max_index = -1;
    for (int i = 0; i < n; i++) {
        if (heights[i] == max_val) {
            max_index = i;
            break;
        }
    }
    
    int min_index = -1;
    for (int i = n-1; i >= 0; i--) {
        if (heights[i] == min_val) {
            min_index = i;
            break;
        }
    }
    
    int swaps = max_index + (n - 1 - min_index);
    if (max_index > min_index) {
        swaps--;
    }
    
    cout << swaps << endl;
    return 0;
}
