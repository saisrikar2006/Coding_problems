import java.util.*;
class LastTwoDigOfFibUsingPicasso
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
        int[] f=new int[300];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<300;i++)
        {
            f[i]=(f[i-1]+f[i-2])%100;
        }
        return f[n%300];
    }
}