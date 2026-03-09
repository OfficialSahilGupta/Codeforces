#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n, m;
    cin >> n >> m;

    string x, s;
    cin >> x >> s;

    string current = x;

    for(int i = 0; i <= 6; i++){
        if(current.find(s) != string::npos){
            cout << i << endl;
            return;
        }
        current = current + current;
    }

    cout << -1 << endl;

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