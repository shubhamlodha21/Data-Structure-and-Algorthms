//Find Sum of Maximum Subarray in array using kadane algorithm
//O(n)

#include<bits/stdc++.h>
using namespace std;
int MaxSubArraySum(int *arr,int n)
{
    int max=INT_MIN;
    int sum=0,start=0,end=0,strat1=0;
    for(int i=0;i<n;i++)
    { 
       sum+=arr[i];
       if(max<sum)
       {
           max=sum;
           start1=end1;
           end=i;
       }

       if(sum<0)
       {
           sum=0;
           start=i;
       }
    }
    cout<<"Starting:"<<start<<"Ending:"<<end<<"\n";
    return max;
}
int main()
{
    int arr[]={14,9,-78,45,-2,10,12,-7,7,-9,6};
    int n=sizeof(arr)/sizeof(arr[0]);
    int ans=MaxSubArraySum(arr,n);
    cout<<"Maximum Sub-Array Sum is:"<<ans;
}