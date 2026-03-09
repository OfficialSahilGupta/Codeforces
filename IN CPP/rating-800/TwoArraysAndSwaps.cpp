#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n, k;
    cin >> n;
    cin >> k;

    vector<int> a(n);
    vector<int> b(n);

    for(int i = 0; i < n; i++){
        cin >> a[i];
    }

    for(int i = 0; i < n; i++){
        cin >> b[i];
    }

    sort(a.begin(), a.end());
    sort(b.begin(), b.end(), greater<int>());

    for(int i = 0; i < k; i++){
        if(b[i] > a[i]){
            a[i] = b[i];
        }
        else break;
    }
    int sum = 0;
    for(int x : a){
        sum += x;
    }

    cout << sum << endl;

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