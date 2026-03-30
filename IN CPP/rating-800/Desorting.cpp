#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;

    vector<int> arr(n);
    int mx = INT_MIN;
    int second_mx = INT_MIN;
    for(int i = 0; i < n; i++){
        cin >> arr[i];

    }
    // already not sorted
    for(int i = 0; i < n - 1; i++){
        if(arr[i] > arr[i+ 1]){
            cout << 0 << endl;
            return;
        }
    }

    long long ans = LLONG_MAX;
    for(int i = 0; i < n - 1; i++){
        long long diff = arr[i + 1] - arr[i];
        ans = min(ans, diff/2 + 1);
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