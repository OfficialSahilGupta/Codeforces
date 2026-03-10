#include <bits/stdc++.h>
using namespace std;

void solve(){
    string str;
    cin >> str;

    int n = str.length();

    string ans = str.substr(0, str.length() - 2);
    ans += 'i';

    cout << ans << endl;
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