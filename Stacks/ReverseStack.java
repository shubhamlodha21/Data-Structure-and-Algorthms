import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
                String s = sc.next();

                Stack<Character> stack1 = new Stack<>();

                for(int i=0;i<s.length();i++)
                        {
                                stack1.push(s.charAt(i));
                        }

               while(!stack1.empty())
                       {
                               System.out.print(stack1.pop());
                       }
                
	}
}