import java.util.*;
public class PrimeFactor
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        Prime(n);
    }
    public static void Prime(int n)
    {
        for(int i=2;i<=n;i++)
        {
            while(n%i==0)
            {
                System.out.println(i);
                n=n/i;
            }
        }
    }
}