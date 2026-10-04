import java.util.*;
class Findn
{
	public static int fib(int n)
        {
         	int a=0,b=1,c=0;
        	if(n==0)
        	return 0;
        	else if(n==1)
        	return 1;
        	else
        	{
            		for(int i=2;i<=n;i++)
            		{
                		c=a+b;
                		a=b;
                		b=c;
            		}
        	}
        	return b;
        }
	public static boolean isPrime(int c)
	{
		if(c==2||c==3)
		return true;
		if(c%2==0||c%3==0)
		return false;
		for(int i=5;i*i<=c;i+=6)
		{
			if(c%i==0||c%(i+2)==0)
				return false;
		}
		return true;
	}
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int prime[]=new int[n+1];
		prime[0]=2;
		prime[1]=3;
		int m=2;
		for(int i=5;m<=n;i+=2)
		{
			if(isPrime(i))
			{
				prime[m++]=i;
			}
		}
		ArrayList<Integer> li=new ArrayList<>();
		int c=0;
		for(int i=0;i<=n;i+=2)
		{
			li.add(fib(c));
			li.add(prime[c]);
			c++;
		}
		System.out.println("Output:"+li.get(n-1));
	}
}