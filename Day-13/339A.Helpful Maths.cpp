#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    string s;
    cin >> s;
    vector<int> numbers;
    
    for (char c : s) {
        if (c != '+') {
            numbers.push_back(c - '0');
        }
    }
    
    sort(numbers.begin(), numbers.end());
    
    for (int i = 0; i < numbers.size(); ++i) {
        if (i != 0) {
            cout << "+";
        }
        cout << numbers[i];
    }
    
    return 0;
}
