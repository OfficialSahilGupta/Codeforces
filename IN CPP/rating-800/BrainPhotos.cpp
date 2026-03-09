#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n, m;
    cin >> n >> m;
    vector<vector<char>> arr(n, vector<char>(m));
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            cin >> arr[i][j];
        }
    }

    bool find = false;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            int current = arr[i][j];
            if(current == 'C' || current == 'M' || current == 'Y'){
                find = true;
                break;
            }
        }
    }
    cout << (find ? "#Color" : "#Black&White") << endl;

}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    solve();

    return 0;
}