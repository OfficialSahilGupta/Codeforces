#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n;
    cin >> n;

    string str;
    cin >> str;

    int arr[] = {0, 0};
    bool result = false;
    for(int i = 0; i < n; i++){
        char current = str[i];

        if(current == 'U' || current == 'D'){
            if(current == 'U'){
                if(arr[0] == 1 && arr[1] == 1){
                    result = true;
                    break;
                }
                arr[1] += 1;
            }
            else{
                if(arr[0] == 1 && arr[1] == 1){
                    result = true;
                    break;
                }
                arr[1] -= 1;
            }
        }
        else{
            if(current == 'R'){
                if(arr[0] == 1 && arr[1] == 1){
                    result = true;
                    break;
                }
                arr[0] += 1;
            }
            else {
                if(arr[0] == 1 && arr[1] == 1){
                    result = true;
                    break;
                }
                arr[0] -= 1;
            }
        }
    }
    if((arr[0] == 1 && arr[1] == 1) || result){
        cout << "YES" << "\n";
    }
    else cout << "NO" << "\n";

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