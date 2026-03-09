#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;

    string first, second;
    cin >> first >> second;

    int diff = 0;
    for(int i = 0; i < n; i++){
        if(first[i] == 'G') first[i] = 'B';
        if(second[i] == 'G')second[i] = 'B';
        
    }
    if(first == second) cout << "YES" << endl;

    else cout << "NO" << endl;
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