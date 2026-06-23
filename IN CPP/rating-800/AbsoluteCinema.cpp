#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;
    vector<long long> a(n);
    vector<long long> b(n);

    for(int i = 0; i < n; i++){
        cin >> a[i];
    }

    for(int i = 0; i < n; i++){
        cin >> b[i];
    }

    for(int i = 0; i < n; i++){
        if(b[i] < a[i]){
            long long temp = b[i];
            b[i] = a[i];
            a[i] = temp;
        }
    }

    long long maxValue = INT_MIN;
    long long sum = 0;
    for(int i = 0; i < n; i++){
        if(a[i] > maxValue) maxValue = a[i];
        sum += b[i];
    }

    cout << (sum + maxValue) << "\n";


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