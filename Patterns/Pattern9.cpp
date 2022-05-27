#include<iostream>
using namespace std;

void Pattern(int n)
{
    for(int i='A';i<='A'+n ;i++)
    {
        for(int j='A';j<='A'+n ;j++)
        {
            cout<<char(i)<<" ";
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