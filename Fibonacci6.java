import java.util.*;
class Fibonacci6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(Sumfib(n));
    }
        public static int fib(int n)
        {
            int a=0,b=1,c=0;
        if(n==0)
        System.out.println("Fibanocci is 0");
        else if(n==1)
        System.out.println("Fibanocci is 1");
        else
        {
            for(int i=2;i<=n;i++)
            {
                c=a+b;
                a=b;
                b=c;
            }
        }
        return b;
        }
        public static int Sumfib(int n)
        {
            
            return fib(n+2)-1;
        }
    
}