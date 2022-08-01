#include<bits/stdc++.h>
using namespace std;

void StrPalindrom(char c[])
{
    int i=0,j=0,flag=0;
    while(c[i]!='\0')
    {
        i++;
    }

    while(j<=i-1)
    {
        if(c[j]==c[i-1])
        {
            //cout<<c[j]<<"=="<<c[i-1]<<endl;
            j++;
            i--;
            flag=1;
        }
        else
        {
            flag=0;
            break;
        }   
    }

    if(flag==0)
    {
        cout<<"Not Palindrome";
    }
    else
    {
        cout<<"Palindrome";
    }
}

int main()
{
    char ch1[]="racecar";
    StrPalindrom(ch1);
    return 0;
}