import java.util.*;
class NthFactorialArthemetic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
    public static long fact(int n)
    {
        long f=1;
        for(int i=1;i<=n;i++)
        {
            f=(f*i)%1000000007;
        }
        return f;
    }
}