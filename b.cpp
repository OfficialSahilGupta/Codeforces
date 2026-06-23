#include <bits/stdc++.h>
using namespace std;

void solve(){
    long long n;
    cin >> n;
    
    if(n == 10){
        cout << -1 << "\n";
        return;
    }
    long long rem = n % 12;
    long long a;

    if(rem <= 9) a = rem;
    else if(rem == 10) a = 22;
    else a = 11;

    if(a > n){
        cout << -1 << "\n";
    }
    else{
        cout << a << " " << (n - a) << "\n";
    }



}

bool isPalindrome(int n){
    int temp = n;
    int sum = 0;

    while(temp > 0){
        int rem = temp % 10;
        sum = sum * 10 + rem;
        temp /= 10;
    }

    if(sum == n){
        return true;
    }
    else return false;
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