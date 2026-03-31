#include <bits/stdc++.h>
using namespace std;

void solve(){
    array<array<char, 8>,  8> arr = {};

    string s = "";

    for(int i = 0; i < 8; i++){
        for(int j = 0; j < 8; j++){
            cin >> arr[i][j];
            if(arr[i][j] != '.'){
                s += arr[i][j];
            }
        }
    }

    cout << s << endl;
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