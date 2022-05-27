#include<iostream>
using namespace std;

void Pattern(int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<=(i+1)+i;j++)
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