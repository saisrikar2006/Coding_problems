import java.util.*;
class TwoPointer1
{
	static int targetPairs(int a[],int n,int target)
	{
		int c=0;
		for(Integer i=0;i<n-1;i++)
		{
			for(Integer j=i+1;j<n;j++)
			{
				if((a[i]+a[j])==target)
				{
					c++;
				}
			}
		}
		return c;
	}
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int target=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int res=targetPairs(ar,n,target);
		System.out.println("OUTPUT:"+res);
	}
}