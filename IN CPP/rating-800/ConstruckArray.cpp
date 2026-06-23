#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;
    vector<int> array (n);
    int number = 2 * n;
    for(int i = 0; i < n; i++){
        if(n == 1){
            array[i] = 1;
        }
        else {
            array[i] = number;
            number--;
        }
    }
    for(int i = 0; i < n; i++){
        cout << array[i] << " ";
    }
    cout << "\n";
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