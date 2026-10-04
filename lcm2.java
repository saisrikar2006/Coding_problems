import java.io.*;
import java.util.*;
public class lcm2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        int k=lcm(a,b);
        System.out.println(k);
    }
    public static int lcm(int a,int b)
    {
        int x=Math.min(a,b);
        int y=Math.max(a,b);
        for(int i=y; ;i=i+y)
        {
            if(i%y==0)
            {
                return i;
            }
        }
    }
}