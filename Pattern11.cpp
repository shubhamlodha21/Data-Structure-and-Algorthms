#include<iostream>
using namespace std;

void Pattern(int n)
{
    for(int i='A';i<'A'+n ;i++)
    {
        for(int j=i;j<i+3 ;j++)
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