#include <bits/stdc++.h>
using namespace std;

void solve(){
    long long a, b, c, n;
    cin >> a >> b >> c >> n;

    long long sum = a + b + c + n;
    if(sum % 3 != 0){
        cout << "NO" << endl;
        return;
    }

    long long target = sum / 3;

    if(a <= target && b <= target && c <= target){
        cout << "YES" << endl;
    }
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