import java.util.*;
class MultiplyTheNumWithoutUsingOperator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(plus(n));
    }
    public static int plus(int n)
    {
        int k=n<<1;
        return k;
    }
}