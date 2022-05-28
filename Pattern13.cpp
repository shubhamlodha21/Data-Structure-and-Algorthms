#include<iostream>
using namespace std;

void Pattern(int n)
{
    for(int i='A'+n;i>='A';i--)
    {
        for(int j='A'+n;j>=i;j--)
        {
           cout<<char(j)<<" ";
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