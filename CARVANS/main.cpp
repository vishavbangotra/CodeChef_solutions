#include <iostream>
#include <stdio.h>
#include <limits.h>

using namespace std;

int main() {
    unsigned int t, n;
    cin>>t;
    while(t--){
        unsigned long int one=ULONG_MAX, two;
        unsigned int i=0;
        cin>>n;
        for(unsigned int j=0; j<n; j++){
            cin>>two;
            if(one>=two){
                i++;
                one=two;
            }
        }
        cout<<i<<endl;
    }
    return 0;
}
