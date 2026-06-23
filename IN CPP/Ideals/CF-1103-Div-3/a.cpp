#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;
    vector<int> a (n);
    int minValue = INT_MAX;
    int maxValue = INT_MIN;

    for(int i = 0; i < n; i++){
        cin >> a[i];
        if(a[i] < minValue) minValue = a[i];
        if(a[i] > maxValue) maxValue = a[i];
    }
    
    cout << ((maxValue - minValue) + 1) << '\n';

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