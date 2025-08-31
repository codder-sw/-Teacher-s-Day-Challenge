#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int points[n];
    for (int i = 0; i < n; i++) {
        cin >> points[i];
    }
    int count = 0;
    int max = points[0];
    int min = points[0];
    for (int i = 1; i < n; i++) {
        if (points[i] > max) {
            count++;
            max = points[i];
        } else if (points[i] < min) {
            count++;
            min = points[i];
        }
    }
    cout << count << endl;
    return 0;
}
