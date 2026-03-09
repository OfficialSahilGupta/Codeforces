#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;
    int ans = 0;
    while(n > 0){
        if(n > 2){
            ans = ans + (n / 4);
            n = n - (ans * 4);
        }
        else{
            ans = ans + (n / 2);
            n = n - (ans * 2);
        }

    }
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