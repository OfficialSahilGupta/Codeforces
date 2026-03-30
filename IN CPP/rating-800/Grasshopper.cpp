#include <bits/stdc++.h>
using namespace std;

void solve(){
    int x, k;
    cin >> x >> k;

    int n;
    if(x % k == 0){
        n = 2;
    }
    else n = 1;

    cout << n << endl;
    
    if(x % k == 0){
        cout << x - 1 << " " << 1 << endl;
    }
    else{
        cout << x;
        cout << endl;
    }

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