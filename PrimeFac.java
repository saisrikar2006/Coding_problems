import java.util.*;
public class PrimeFac
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number..");
        int n=sc.nextInt();
        Prime(n);
    }
    public static void Prime(int n)
    {
        while(n%2==0)
        {
            System.out.println(2);
            n=n/2;
        }
        for(int i=3;i*i<=n;i++)
        {
            while(n%i==0)
            {
                System.out.println(i);
                n=n/i;
            }
        }
        if(n>1)
        System.out.println(n);
    }
}