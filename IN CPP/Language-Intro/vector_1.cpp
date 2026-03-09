#include<bits/stdc++.h>
using namespace std;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    vector<int> c = {10, 23, 4, 2, 5, 89};
    sort(c.begin(), c.end());

    for(int i = 0; i < c.size(); i++){
        printf("%d ", c[i]);
    }
    printf("\n");

    sort(c.rbegin(), c.rend());
    for(int i = 0; i < c.size(); i++){
        printf("%d ", c[i]);
    }
    printf("\n");
    return 0;
}