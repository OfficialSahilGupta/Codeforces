#include<bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int age;
    cout << "Enter your age: ";
    cin >> age;

    if(age >= 18){
        cout << "You are an adult." << endl;
    }
    else if(age <= 0){
        cout << "This is not a valid age." << endl;
    }
    else{
        cout << "You are not an adult." << endl;
    }
    return 0;
}