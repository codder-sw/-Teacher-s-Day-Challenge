#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> heights(n);
    for (int i = 0; i < n; i++) {
        cin >> heights[i];
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
    cout << maxWatered << endl;
    return 0;
}
