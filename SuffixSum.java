import java.util.*;
class SuffixSum
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=n-2;i>=0;i--)
		{
			a[i]=a[i]+a[i+1];
		}
		System.out.println("output:");
		for(int i:a)
		{
			System.out.println(i);
		}
	}
}


