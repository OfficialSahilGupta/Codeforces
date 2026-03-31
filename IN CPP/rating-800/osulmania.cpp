#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;

    vector<int> result;

    for(int i = 0; i < n; i++){
        string rows;
        cin >> rows;

        for(int j = 0; j < 4; j++){
            if(rows[j] != '.'){
                result.push_back(j + 1);
            }
        }

    }

    for(int i = result.size() - 1; i >= 0; i--){
        cout << result[i] << (i == 0 ? "" : " ");
    }

    cout << "\n";

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