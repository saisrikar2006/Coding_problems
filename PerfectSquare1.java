import java.util.*;
class PerfectSquare1
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
        int i=(int)Math.sqrt(n);
            if(i*i==n)
            {
                return true;
            }
            else

        return false;
    }
}