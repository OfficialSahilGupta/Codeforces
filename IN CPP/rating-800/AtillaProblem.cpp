#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n; 
    cin >> n;
    string s;
    cin >> s;

    char maxChar = *max_element(s.begin(), s.end());

    int maxValue = maxChar - 'a' + 1;

    cout << maxValue << endl;
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin >> t;
    while(t--){
        solve();
    }

    return 0;
}