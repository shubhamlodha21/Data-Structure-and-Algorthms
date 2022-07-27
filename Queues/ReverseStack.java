//Create One Stack using one another stack 

import java.util.*;
import java.io.*;

public class ReverseStack
{
    public static void main(String[] args) 
    {
        int arr[]=new int[100];
        int brr[]=new int[100];
    
        int top1=-1,top2=-1;

        for(int i=0;i<10;i++)
        {
            arr[++top1]=i;
        }

        while(top1!=-1)
        {
            brr[++top2]=arr[top1--];
        }
        
        System.out.println("Reverse Stack is==>");
        for(int i=0;i<10;i++)
        {
            System.out.println(brr[i]);
        }

    }
}
