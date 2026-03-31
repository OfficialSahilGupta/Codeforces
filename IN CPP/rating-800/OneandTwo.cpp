#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;

    vector<int> arr (n);
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }
    int ans = -1;
    for(int i = 1; i <= n - 1; i++){
        int before_two = 0;
        int after_two = 0;
        for(int j = 0; j < i; j++){
            if(arr[j] == 2) before_two++;
        }
        for(int j = i ; j < n; j++){
            if(arr[j] == 2) after_two++;
        }

        if(before_two == after_two){
            ans = i;
            break;
        }

    }

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