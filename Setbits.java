import java.util.*;
class Setbits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(set(n));
        System.out.println(set1(n));
    }
    public static int set(int n)
    {
        int c=0;
        while(n>0)
        {
        if(n%2==1)
            c++;
            n=n/2;
        }
        return c;

    }
    public static int set1(int n)
    {
        int c=0;
        while(n>0)
        {
            if((n&1)==1)
            c++;
            n=n>>1;
        }
        return c;
    }
}