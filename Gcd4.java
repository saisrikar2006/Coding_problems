import java.util.*;
public class Gcd4{

    public static int gcd(int a, int b)
    {
       for(int i=Math.min(a,b);i>=1;i--){
           if(a%i==0&&b%i==0)
               return i;
            }
        return 1;
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