import java.util.*;
class Fibonacci2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        if(n==0)
        System.out.println("Fibanocci is 0");
        else if(n==1)
        System.out.println("Fibanocci is 1");
        else
        {
            int a=0,b=1,c=0;
            for(int i=1;i<=n;i++)
            {
                System.out.println(a);
                c=a+b;
                a=b;
                b=c;
            }
        }
    }
}