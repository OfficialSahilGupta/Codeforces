#include <bits/stdc++.h>
using namespace std;

void solve(){
    string s;
    cin >> s;
    int sum = 0;
    char currnet = 'a';

    for(int i = 0; i < s.length(); i++){
        char target = s[i];
        int diff = abs(currnet - target);
        sum += min(diff, 26 - diff);
        currnet = target;
    }

    cout << sum << endl;
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    solve();

    return 0;
}