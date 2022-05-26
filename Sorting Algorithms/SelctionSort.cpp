// Insertion-Sort

#include<bits/stdc++.h>
using namespace std;

void SelectionSort(int n,int *arr)
{
    for(int i=0;i<n-1;i++)
    {
        int index=i;
        for(int j=i+1;j<n;j++)
        {
            if(arr[index]>arr[j])
            {
                swap(arr[index],arr[j]);
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

    SelectionSort(iNo,arr);

    return 0;
}