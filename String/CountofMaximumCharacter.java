//Count the length of character having maximum frquency.

public class CountofMaximumCharacter
{
	public static void main(String[] args) {
	  String s = "Hello Everyone to DSA. Welcome to the course";
	  int mx = 0,count = 0;
	  char ch = ' ';
	  
	  for(int i = 0; i<s.length(); i++)      // O(n^2)
	  {
	      count = 0;
	     for(int j = i; j<s.length(); j++)
	     {
	        if(s.charAt(i) == s.charAt(j))
	        {   count++;
	        }
	     }
	     if(count > mx)
	     {   mx = count;
	         ch = s.charAt(i);
	     }
	  }
	  System.out.println(mx+ " " + ch);
	}
}