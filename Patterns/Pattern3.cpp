#include<iostream>
using namespace std;

void Pattern(int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i>=j)
            {
                cout<<"*"<<" ";
            }
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