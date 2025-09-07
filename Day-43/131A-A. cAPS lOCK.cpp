#include <iostream>
#include <cctype>
#include <string>
using namespace std;

int main() {
    string word;
    cin >> word;
    bool allUpperExceptFirst = true;
    
    // Check if all characters except possibly the first are uppercase
    for (int i = 1; i < word.length(); i++) {
        if (!isupper(word[i])) {
            allUpperExceptFirst = false;
            break;
        }
    }
    
    if (allUpperExceptFirst) {
        if (islower(word[0])) {
            word[0] = toupper(word[0]);
            for (int i = 1; i < word.length(); i++) {
                word[i] = tolower(word[i]);
            }
        } else {
            for (int i = 0; i < word.length(); i++) {
                word[i] = tolower(word[i]);
            }
        }
    } else {
        // Check if all characters are uppercase
        bool allUpper = true;
        for (char c : word) {
            if (!isupper(c)) {
                allUpper = false;
                break;
            }
        }
        if (allUpper) {
            for (int i = 0; i < word.length(); i++) {
                word[i] = tolower(word[i]);
            }
        }
    }
    
    cout << word << endl;
    return 0;
}
