import java.util.*;
import java.math.BigInteger;
class FactorialUsingBigInt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
    public static BigInteger fact(int n)
    {
        BigInteger f=BigInteger.ONE;
        for(int i=1;i<=n;i++)
        {
            f=f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}