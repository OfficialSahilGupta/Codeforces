#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;
    int a = 0, b = 0;

    while(n % 2 == 0){
        n /= 2;
        a++;
    }
    while(n % 3 == 0){
        n /= 3;
        b++;
    }

    if(n != 1 || a > b){
        cout << -1 << endl;
        return;
    }

    cout << (2 * b - a) << endl;

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