#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    string s, t;
    cin >> s >> t;
    string reversed_s = s;
    reverse(reversed_s.begin(), reversed_s.end());
    cout << (reversed_s == t ? "YES" : "NO") << endl;
    return 0;
}
