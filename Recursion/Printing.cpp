//Printing Statement for 5 times

#include<bits/stdc++.h>
using namespace std;

void Print(int iCnt)
{
    if(iCnt>5)
    {
        return ;
    }

    cout<<"Hey I am Called "<<iCnt<<" th time"<<endl;
    Print(iCnt+1);
}

int main()
{
    int count=1;
    Print(count);
    return 0;
}