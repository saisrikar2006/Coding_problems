import java.util.*;
class PowerOfPrimeFactor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
       Unique(n);
    }
    public static void Unique(int n)
    {
        
        if(n%2==0)
        {
            int count=0;
            while(n%2==0)
            {
                count++;
                n=n/2;
            }
            if(count>0)
            System.out.println("2^ "+count);
        }
        for(int i=3;i*i<=n;i+=2)
        {
            int count=0;
            while(n%i==0)
            {
                count++;
                n=n/i;
            }
                if(count>0)
                System.out.println(i+"^"+count);
        }
        if(n>1){
            System.out.println(n+"^1");
        }
    }
}