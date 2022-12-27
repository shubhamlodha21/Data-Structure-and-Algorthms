// "static void main" must be defined in a public class.
public class Main {
    public static int Factorial(int n)
    {
        if(n==0)
        {
            return 0;
        }
        
        return (n * Factorial(n-1));
    }
    public static void main(String[] args) {
       int a = Factorial(5);
        System.out.println(a);
    }
}