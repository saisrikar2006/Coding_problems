import java.util.*;
class TrailingZerosInFact
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(trail(n));
    }
    public static int trail(int n)
    {
        int c=0;
        for(int i=5;i>=5;i=i*5)
        {
            c=c+n/i;
        }
        return c;
    }
}