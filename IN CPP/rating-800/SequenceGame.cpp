#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;

    vector<long long> b (n);
    for(int i = 0; i < n; i++){
        cin >> b[i];
    }

    vector<long long> a;
    a.push_back(b[0]);

    for(int i = 1; i < n; i++){
        if(b[i] < b[i - 1]){
            a.push_back(b[i]);
        }
        a.push_back(b[i]);
    } 

    cout << a.size() << endl;
    for(int i = 0; i < a.size(); i++){
        if(i > 0) cout << " ";
        cout << a[i];
    }
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