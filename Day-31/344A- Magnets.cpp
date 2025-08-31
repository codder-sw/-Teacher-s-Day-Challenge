#include <iostream>
#include <string>
using namespace std;

int main() {
    int n;
    cin >> n;
    string prev;
    cin >> prev;
    int groups = 1;
    for (int i = 1; i < n; i++) {
        string current;
        cin >> current;
        if (prev[1] == current[0]) {
            groups++;
        }
        prev = current;
    }
    cout << groups << endl;
    return 0;
}
