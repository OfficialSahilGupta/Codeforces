#include <bits/stdc++.h>
using namespace std;

void solve(){
    string str;
    getline(cin, str);

    string ans = "";
    for(int i = 0; i < str.length(); i++){
        if(i == 0){
            ans += str[i];
        }
        if(str[i] == ' '){
            ans += str[i + 1];
        }
    }

    cout << ans << endl;

}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin >> t;
    cin.ignore();
    while(t--){
        solve();
    }

    return 0;
}