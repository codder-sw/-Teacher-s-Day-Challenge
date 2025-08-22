#include <iostream>
#include <cctype>
#include <string>
using namespace std;

int main() {
    string s;
    cin >> s;
    int upperCount = 0;
    int lowerCount = 0;
    for (char c : s) {
        if (isupper(c)) {
            upperCount++;
        } else {
            lowerCount++;
        }
    }
    if (upperCount > lowerCount) {
        for (char &c : s) {
            c = toupper(c);
        }
    } else {
        for (char &c : s) {
            c = tolower(c);
        }
    }
    cout << s << endl;
    return 0;
}
