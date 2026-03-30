#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;

    vector<int> arr(n);

    int min = INT_MAX;
    for(int i = 0; i < n; i++){
        cin >> arr[i];

        if(arr[i] < min){
            min = arr[i];
        }
    }

    if(arr[0] == min){
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