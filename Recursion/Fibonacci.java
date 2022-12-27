// fibonacci Series
public class Main {
    static int a=0,b=1,c=0;
    public static void Fibonacci(int n)
    {
        if(n>0)
        {    
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            Fibonacci(n-1);
        }      
    }
    public static void main(String[] args) {
     Fibonacci(10);
        
    }
}