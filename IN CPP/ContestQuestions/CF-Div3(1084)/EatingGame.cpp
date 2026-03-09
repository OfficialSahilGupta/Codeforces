#include<bits/stdc++.h>
using namespace std;

void solve(){

    int n;
    cin >> n;
    vector<int> a(n);
    int max_val = 0;

    for(int i = 0; i < n; i++){
        cin >> a[i];
        if(a[i] > max_val){
            max_val = a[i];
        }
    }

    int count = 0; 
    for(int i = 0; i < n; i++){
        if(a[i] == max_val){
            count++;
        }
    }
    cout << count << endl;
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