//Binary Search Algorithm
//O(log n)

#include<iostream>
using namespace std;


int BinarySearch(int n,int k,int *arr)
{
    int start=0,end=n-1;
    int mid=(start+end)/2;

    while(start<=end)
    {
        if(k==arr[mid])
        {
            return mid;
        }

        if(k>arr[mid])
        {
            start=mid+1;
        }
        else
        {
            end=mid-1;
        }

        mid=(start+end)/2;
    }

    return -1;
}


int main()
{
    int iNo=0,k=0;
    int *arr=new int[iNo];

    cout<<"Enter Number of Elements:";
    cin>>iNo;

    cout<<"Enter Element you want Find:";
    cin>>k;

    cout<<"Enter Elements:";
    for(int i=0;i<iNo;i++)
    {
        cin>>arr[i];
    }

    int ans=BinarySearch(iNo,k,arr);
    cout<<"Element is presesnt at"<<ans<<"position";
    return 0;
}