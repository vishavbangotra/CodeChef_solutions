#include <iostream>

using namespace std;

unsigned long long int factorial(unsigned long long int num){
    unsigned long long int fac=1, i;
    if( num == 0 )
        return 1;
    else{
        for(i=1; i<=num; i++){
            fac = fac * i;
        }
    }
    return fac;
}
unsigned long int zero(unsigned long long int num){
    unsigned long int i=0;
    while(num%10==0){
        i++;
        num = num/10;
    }
    return i;
}

int main() {
    unsigned long int t;
    unsigned long long int k;
    cin>>t;
    
    while(t--){
        cin>>k;
        cout<<factorial(k)<<endl;
    }
    return 0;
}
