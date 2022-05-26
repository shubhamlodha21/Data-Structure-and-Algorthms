// Insertion-Sort

#include<bits/stdc++.h>
using namespace std;

void InsertionSort(int n,int *arr)
{
    for(int i=1;i<n;i++)
    {
        int index=arr[i];
        int j=i-1;
        while((j>=0) && arr[j]>index)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=index;
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

    InsertionSort(iNo,arr);

    return 0;
}