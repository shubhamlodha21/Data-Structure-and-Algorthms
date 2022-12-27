// Power of Number
public class Main {
    public static int Power(int n,int m)
    {
        if(m==0)
        {
            return 1;
        }
        
        return (n * Power(n,m-1));
    }
    public static void main(String[] args) {
       int a = Power(5,3);
        System.out.println(a);
    }
}