import java.util.*;
class PerfectSquare
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
        while(i*i<=n)
        {
            if(i*i==n)
            {
                return true;
            }
            i++;
        }
        return false;
    }
}