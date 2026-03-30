#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;

    vector<int> arr(n);
    for(int i = 0; i < n; i++){
        cin >> arr[i]; 
    }

    int current = 1;
    int ans = 1;
    for(int i = 1; i < n; i++){
        if(arr[i] > arr[i - 1]){
            current++;
        }
        else{
            current = 1;
        }

        ans = max(current, ans);

    }
    cout << ans << endl;
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    solve();
    return 0;
}