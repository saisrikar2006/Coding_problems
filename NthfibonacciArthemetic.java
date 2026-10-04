import java.util.*;
class NthfibonacciArthemetic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n)
    {
        if(n==0||n==1)
        return 0;
        int a=0,b=1;
        int c=0;
        for(int i=2;i<=n;i++)
        {
            c=(a+b)%1000000007;
            a=b;
            b=c;
        }
        return c;
    }
}