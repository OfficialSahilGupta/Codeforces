#include <bits/stdc++.h>
using namespace std;

void solve(){
    long long n, a, b;
    cin >> n >> a >> b;

    long long groups = n / 3;
    long long rem = n % 3;

    long long ans = groups * min(3 * a, b);
    if(rem == 1){
        ans += min(a, b);
    }
    else if(rem == 2) ans += min(2 * a, b);
    

    cout << ans << "\n";
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