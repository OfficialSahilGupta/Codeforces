#include<bits/stdc++.h>
using namespace std;


int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    vector<int> v;
    v.push_back(10);
    v.push_back(20);
    int size = v.size();

    for(int i = 0; i < size; i++){
        printf("%d ", v[i]);
    }

    printf("\nSize: %d\n", size);

    return 0;
}