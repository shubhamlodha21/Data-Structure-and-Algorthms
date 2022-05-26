#include<bits/stdc++.h>
using namespace std;

void BubbleSort(int n,int *arr)
{
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                swap(arr[j],arr[j+1]);
            }
        }
    }
    

    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<endl;
    }

}

int main ()
{
    int iNo=0;
    int *arr=new int[iNo];

    cout<<"Enter Number of Elements:";
    cin>>iNo;

    cout<<"Enter Elements:";
    for(int i=0;i<iNo;i++)
    {
        cin>>arr[i];
    }

    BubbleSort(iNo,arr);

    return 0;
}