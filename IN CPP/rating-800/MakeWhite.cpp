#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;
    string str;
    cin >> str;

    int ans = 1;
    if(n == 1){
        cout << ans << "\n";
        return;
    }
    int j = n - 1;
    int i = 0;
    while(i <= j){
        if(str[i] == 'B' && str[j] == 'B'){
            ans = j - i + 1;
            break;
        }
        else if(str[i] == 'B' && str[j] == 'W'){
            j--;
        }
        else i++;
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