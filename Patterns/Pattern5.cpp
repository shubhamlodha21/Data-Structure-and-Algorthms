#include<iostream>
using namespace std;

void Pattern(int n)
{
    int k=1;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(i>=j)
            {
                cout<<k<<" ";
                k++;
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