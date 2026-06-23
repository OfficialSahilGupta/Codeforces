#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;

    vector<long long> a(n), b(n);

    for(int i = 0; i < n; i++) cin >> a[i];
    for(int i = 0; i < n; i++) cin >> b[i];

    set<pair<long long, int>> available;
    for(int i = 0; i < n; i++){
        available.insert({b[i], i});
    }

    vector<int> p(n);
    bool possible = true;

    for(int i = 0; i < n; i++){
        auto it = available.lower_bound({a[i], -1});

        if(it == available.end()){
            possible = false;
            break;
        }

        p[i] = it -> second;
        available.erase(it);
    }

    if(!possible){
        cout << -1 << '\n';
        return;
    }

    long long inversions = 0;
    for(int i = 0; i < n; i++){
        for(int j = i + 1; j < n; j++){
            if(p[i] > p[j]) inversions++;
        }
    }

    cout << inversions << '\n';


}


int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while(t--){
        solve();
    }

    return 0;
}


