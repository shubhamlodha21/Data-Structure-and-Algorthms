//Count of each element in Array

import java.util.*;
public class ArrayHashing
{
	public static void main(String[] args) {
		int a[] = {2, 4, 5, 1, 3, 5, 2, 4, 7};
		
		int n = a.length;
        int h[] = new int[100000000];               
 		for(int i = 0; i < n; i++)
		{
		    h[a[i]]++;
		}
		for(int j = 0; j< 100000000; j++)
		{
		    if(h[j] > 0)
		      System.out.println(j + " " + h[j]);
		} 
	}
}

