#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n, k;
    cin >> n >> k;
    vector<int> scores(n);
    for (int i = 0; i < n; ++i) {
        cin >> scores[i];
    }
    int threshold = scores[k - 1];
    int advancers = 0;
    for (int score : scores) {
        if (score >= threshold && score > 0) {
            advancers++;
        }
    }
    cout << advancers << endl;
    return 0;
}
