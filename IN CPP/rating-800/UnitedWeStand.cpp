#include <bits/stdc++.h>
using namespace std;

void solve(){
    
    int n;
    cin >> n;

    vector<int> a(n);
    for(int i = 0;  i < n; i++){
        cin >> a[i];
    }
    sort(a.begin(), a.end());

    vector<int> b, c;

    int mx = a[n - 1];
    if(a[0] == mx){
        cout << -1 << endl;
        return;
    }

    for(int x : a){
        if(x == mx){
            c.push_back(x);
        }
        else b.push_back(x);
    }


    cout << b.size() << " " << c.size() << endl;
    for(int x : b) cout << x << " ";
    cout << endl;

    for(int x : c) cout << x << " ";
    cout << endl;


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