import java.util.*;
class Coprimes
{
	static int gcd(int a,int b)
	{
		while(a>0&&b>0)
		{
			if(a>b)
			a%=b;
			else
			b%=a;
		}
		if(a==0)
		return b;
		else 
		return a;
	}
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		if(gcd(n,r)==1)
		System.out.println("These are COPRIMES");
		else
		System.out.println("These are NOT-COPRIMES");		
	}
}