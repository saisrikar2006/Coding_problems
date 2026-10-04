import java.util.*;
class TwoPointer6
{
	static boolean is3sum(int a[],int n,int target)
	{
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					int x=a[i]+a[j]+a[k];
					if(x==target)
						return true;
				}
			}
		}
		return false;
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
		int tar=sc.nextInt();
		System.out.println("Output:"+is3sum(a,n,tar));
	}
}
