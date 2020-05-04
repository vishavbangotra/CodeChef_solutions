#include <iostream>
#include <bits/stdc++.h>


using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        int len=s.length();
        if(len%2==0)
        {
            string s1=s.substr(0,len/2);
            string s2=s.substr(len/2,len/2);
            sort(s1.begin(),s1.end());
            sort(s2.begin(),s2.end());
            if(s1==s2)
                cout<<"YES"<<endl;
            else
                cout<<"NO"<<endl;
        }
        else
        {
             string s1=s.substr(0,len/2);
             string s2=s.substr(len/2+1,len/2);
             sort(s1.begin(),s1.end());
            sort(s2.begin(),s2.end());
            if(s1==s2)
                cout<<"YES"<<endl;
            else
                cout<<"NO"<<endl;
        }
    }
    return 0;
}
