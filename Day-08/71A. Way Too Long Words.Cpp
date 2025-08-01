#include <iostream>
#include <string>

using namespace std;

int main() {
    int n;
    cin >> n;
    cin.ignore(); // To ignore the newline after reading n
    
    for (int i = 0; i < n; ++i) {
        string word;
        getline(cin, word);
        
        if (word.length() > 10) {
            cout << word[0] << word.length() - 2 << word.back() << endl;
        } else {
            cout << word << endl;
        }
    }
    
    return 0;
}
