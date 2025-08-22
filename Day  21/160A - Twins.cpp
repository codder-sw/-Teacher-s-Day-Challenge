#include <iostream>
#include <algorithm>
#include <vector>
#include <numeric>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> coins(n);
    for (int i = 0; i < n; i++) {
        cin >> coins[i];
    }
    sort(coins.rbegin(), coins.rend());
    int total = accumulate(coins.begin(), coins.end(), 0);
    int sum = 0;
    int count = 0;
    for (int i = 0; i < n; i++) {
        sum += coins[i];
        count++;
        if (sum > total - sum) {
            break;
        }
    }
    cout << count << endl;
    return 0;
}
