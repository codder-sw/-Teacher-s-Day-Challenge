#include <iostream>
#include <string>
using namespace std;

bool isLucky(int num) {
    if (num == 0) return false;
    while (num > 0) {
        int digit = num % 10;
        if (digit != 4 && digit != 7) {
            return false;
        }
        num /= 10;
    }
    return true;
}

int main() {
    string s;
    cin >> s;
    int count = 0;
    for (char c : s) {
        if (c == '4' || c == '7') {
            count++;
        }
    }
    if (isLucky(count)) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }
    return 0;
}
