import java.util.*;
class GcdAr
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
	static int gcda(int a[],int n)
	{
		int res=gcd(a[0],a[1]);
		for(int i=2;i<n;i++)
		{
			res=gcd(res,a[i]);
		}
		return res;
	}
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("gcd of array:"+gcda(a,n));
	}
}