#include <bits/stdc++.h>
using namespace std;

void solve(){
    int x, y;
    cin >> x >> y;

    int a = 0, b = 0;
    while(true){
        if(x ==  a + 2 && y == b + 1){
            cout << "YES" << endl;
            return;
        }
        if(x == a + 3 && y == b){
            cout << "YES" << endl;
            return;
        }
        if(x == a + 4 && y == b - 1){
            cout << "YES" << endl;
            return;
        }

        
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