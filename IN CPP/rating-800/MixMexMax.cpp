#include <bits/stdc++.h>
using namespace std;
void solve(){
    int n;
    cin >> n;
    vector<int> a(n);
    bool possible = true;
    int val = -1;

    for(int i = 0; i < n; i++){
        cin >> a[i];
        if(a[i] != -1){
            if(a[i] == 0){
                possible = false;
            }
            else if(val == -1){
                val = a[i];
            }
            else if(a[i] != val){
                possible = false;
            }
        }
    }
    cout << (possible ? "YES" : "NO" ) << endl;

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