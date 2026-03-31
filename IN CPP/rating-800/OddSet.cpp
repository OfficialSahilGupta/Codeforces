#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;

    vector<int> arr (2 * n);
    int odd_cout = 0;
    int even_count = 0;
    for(int i = 0; i < 2 * n; i++){
        cin >> arr[i];

        if(arr[i] % 2 == 0){
            even_count++;
        }
        else odd_cout++;
    }

    cout << (even_count == odd_cout ? "YES" : "NO") << "\n";


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