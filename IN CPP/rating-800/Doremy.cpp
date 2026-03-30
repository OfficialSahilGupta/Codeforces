#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;

    vector<int> arr(n);
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }

    if(n == 2){
        cout << "YES" << endl;
        return;
    }

    map<int, int> freq;
    for(auto p : arr){
        freq[p]++;
    }

    if(freq.size() == 1){
        cout << "YES\n";
        return;
    }

    if(freq.size() == 2){
        vector<int> counts;
        for(auto x : freq){
            counts.push_back(x.second);
        }

        int need1 = (n + 1) / 2;
        int need2 = n / 2;

        if((counts[0] == need1 && counts[1] == need2) || 
            counts[0] == need2 && counts[1] == need1){
                cout << "YES\n";
                return;
            }

    }

    cout << "NO\n";

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