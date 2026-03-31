#include <bits/stdc++.h>
using namespace std;

void solve(){
    string str;
    cin >> str;

    string result = "";
    for(int i = str.length() - 1; i >= 0; i--){
        char current = str[i];
        if(current == 'p'){
            result += 'q';
        }
        else if(current == 'q'){
            result += 'p';
        }
        else result += 'w';
    }

    cout << result << "\n";
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