import java.util.*;
public class Gcd2 {

    public static int gcd(int a, int b)
    {
        while(a>0&&b>0)
        {
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        if(a==0)
            return b;

        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,b values: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=gcd(a,b);
        System.out.println(ans);
    }
}