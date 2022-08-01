//Merge Two Sorted Array
//O(n+m)

#include<bits/stdc++.h>
using namespace std;

int main()
{
    int a[]={10,20,30,40};
    int b[]={5,10,20,40,50,60};
    int n=sizeof(a)/sizeof(a[0]);
    int m=sizeof(b)/sizeof(b[0]);
    int *c=new int[n+m];
    int ai=0,bi=0,ci=0;

    while((ai<n)&&(bi<m))
    {
        if(a[ai]<b[bi])
        {
            c[ci]=a[ai];
            ai++;
            ci++;
        }
        else
        {
            c[ci]=b[bi];
            bi++;
            ci++;
        }
    }

    while(bi<m)
    {
        c[ci]=b[bi];
        bi++;
        ci++;
    }

    while(ai<n)
    {
        c[ci]=a[ai];
        ai++;
        bi++;
    }

    for(int ci=0;ci<n+m;ci++)
    {
        cout<<c[ci]<<" ";
    }
}