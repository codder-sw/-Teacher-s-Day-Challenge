#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int p[n];
    for (int i = 0; i < n; i++) {
        cin >> p[i];
    }
    int ans[n];
    for (int i = 0; i < n; i++) {
        int recipient = p[i] - 1; // 0-indexed index of the recipient
        ans[recipient] = i + 1;
    }
    for (int i = 0; i < n; i++) {
        cout << ans[i] << " ";
    }
    cout << endl;
    return 0;
}
