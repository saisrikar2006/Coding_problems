import java.io.*;
import java.util.*;
public class lcm1
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        int k=lcm(a,b);
        System.out.println(k);
    }
    public static int lcm(int a,int b)
    {
        int x=gcd(a,b);
        if(x==0)
        return 0;
        return (a*b)/x;
    }
    public static int gcd(int a,int b)
    {
        while(a>0 && b>0)
        {
            if(a>b)
            {
                a=a%b;
            }
            else
            b=b%a;
        }
        if(a==0)
        return b;
        else
        return a;
    }
}