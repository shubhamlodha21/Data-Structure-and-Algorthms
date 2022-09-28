//Check Whether Two Strings are Anagram OR Not


public class Anagram
{
	public static void main(String[] args) {
	    String s = "Hello World", t = "HelloodlrW ";
	    int n = s.length(),m = t.length();
	    int arr[] = new int[128];
	    
	    if(n != m)
	    {
	        System.out.println("Not Anagram");
	        return;
	    }
	    for(int i = 0; i<128; i++)
	    {
	        arr[i] = 0;
	    }
	    for(int j = 0; j<n; j++)
	    {
	        int ind1 = (int) s.charAt(j);
	        arr[ind1]++;
	        int ind2 = (int) t.charAt(j);
	        arr[ind2]--;
	    }
	    int flag = 0;
	    for(int i =0 ; i<128; i++)
	    {
	        if(arr[i] != 0)
	        {
	            flag = -1;
	            break;
	        }
	    }
	    if(flag == -1)
	    {
	        System.out.println("Not Anagram");
	    }
	    else{
	        System.out.println("Anagram");
	    }
	    
	}
}
