#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n, k;
    cin >> n >> k;
    string s;
    cin >> s;

    for(int r = 0; r < k; r++){
        int ones = 0;
        for(int i = r; i < n; i += k){
            if(s[i] == '1') ones++;
        }
        if(ones & 1){
            cout << "NO\n";
            return;
        }
        
    }
    cout << "YES\n";
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