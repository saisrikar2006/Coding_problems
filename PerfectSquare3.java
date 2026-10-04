import java.util.*;
class PerfectSquare3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        if(isPerfectSquare(n))
        System.out.println("Perfect square");
        else
        System.out.println("Not perfect square");
    }
    public  static boolean isPerfectSquare(int n)
    {
        int i=1;
        while(n>0)
        {
            n=n-i;
            i=i+2;
        }
        if(n==0)
        return true;
        else
        return false;
    }
}