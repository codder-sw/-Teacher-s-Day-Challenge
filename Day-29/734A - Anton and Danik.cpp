#include <iostream>
#include <string>
using namespace std;

int main() {
    int n;
    string s;
    cin >> n >> s;
    int a = 0, d = 0;
    for (char c : s) {
        if (c == 'A') a++;
        else d++;
    }
    if (a > d) cout << "Anton" << endl;
    else if (d > a) cout << "Danik" << endl;
    else cout << "Friendship" << endl;
    return 0;
}
