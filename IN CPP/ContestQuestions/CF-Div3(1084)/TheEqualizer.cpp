#include <bits/stdc++.h>
using namespace std;

void solve(){
    long long n, k;
    cin >> n >> k;
    long long sum = 0;
    for(int i = 0; i < n; i++){
        long long x;
        cin >> x;
        sum += x;
    }

    if(sum % 2 == 1 || (n * k)% 2 == 0){
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while(t--){
        solve();
    }

    return 0;
}