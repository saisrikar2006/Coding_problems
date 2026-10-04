import java.io.*;
import java.util.*;
public class CircularPrime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value...");
        int n=sc.nextInt();
        if(isCircular(n))
        {
            System.out.println("It is circular prime"+n);
        }
        else
        System.out.println("It is not a circular prime"+n);
    }
    public static boolean prime(int n)
    {
        if(n<=1)
        return false;
        if(n==2||n==3)
        return true;
        if(n%2==0 ||n%3==0)
        return false;
        for(int i=5;i*i<=n;i=i+6)
        {
            if(n%i==0||n%(i+2)==0)
            return false;
        }
        return true;
    }
    public static boolean isCircular(int n)
    {
        String s=Integer.toString(n);
        for(int i=0;i<s.length();i++)
        {
            String s11=s;
            String s1=s.substring(1)+s.charAt(0);
            int n1=Integer.parseInt(s1);
            if(!prime(n1))
            return false;
            s=s1;

        }
        return true;
    }
}