//Linear Search Algorithm in Cpp.
//O(n)

#include<iostream>
using namespace std;

int main()
{
    int iNo=0,k=0,flag=1;;
    int *arr=new int[iNo];

    cout<<"Enter Number of Elements:";
    cin>>iNo;

    cout<<"Enter Element you want Find:";
    cin>>k;

    cout<<"Enter Elements:";
    for(int i=0;i<iNo;i++)
    {
        cin>>arr[i];
        if(arr[i]==k)
        {
            flag=0;
            cout<<"Element Found at"<<i+1<<"Index";
        }
    }

    if(flag==1)
    {
        cout<<"Element Not Found !";
    }

    return 0;
}
