#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;

    vector<int> arr (n);
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }

    if(n < 3){
        cout << -1 << endl;
        return;
    }
    sort(arr.begin(), arr.end(), greater<int>());
    int temp = arr[0];
    int count = 1;
    for(int i = 1; i < n; i++){
        if(temp == arr[i]){
            count++;
        }
        else if(temp != arr[i]){
            count = 1;
            temp = arr[i];
        }
        if(count == 3) break;
    }

    cout << (count == 3 ? temp : -1) << endl;


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