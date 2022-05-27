#include<iostream>
using namespace std;

void Pattern(int n)
{
    for(int i=1;i<=n;i++)
    {
        for(int j=i;j>=1;j--)
        {
        
            cout<<j<<" ";
        }
        cout<<"\n";
    }
}

int main()
{
    int iNo=0;
    cout<<"Enter a Number:";
    cin>>iNo;


    Pattern(iNo);
    return 0;
}