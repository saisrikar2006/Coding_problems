import java.util.*;
class SmallestPrimeFactor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println(Unique(n));
    }
    public static int Unique(int n)
    {
        ArrayList<Integer> lis=new ArrayList<>();
        if(n%2==0)
        {
            lis.add(2);
        while (n%2==0)
            n=n/2;
            
        }
        for(int i=3;i*i<=n;i+=2)
        {
            if(n%i==0)
            {
                lis.add(i);
            while(n%i==0)
                n=n/i;
            }
        
        }
        if(n>1){
            lis.add(n);
        }
        int l=lis.get(0);
        return l;
    }
}