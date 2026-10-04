import java.util.*;
import java.lang.*;
class TwoPointer2
{
	public static int targetPairs(int a[],int n,int target)
	{
		int c=0;
		int l=0,r=n-1;
		Arrays.sort(a);
		while(l<r)
		{
			if((a[l]+a[r])<target)
			{
				l++;
			}
			else if((a[l]+a[r])>target)
			{
				r--;
			}
			else
			{
				int c1=0,c2=0,x1=a[l],x2=a[r];
				while(l<=r&&a[l]==x1)
				{
					l++;
					c1++;
				}
				while(l<=r&&a[r]==x2)
				{
					r--;
					c2++;
				}
				if(x1==x2)
				{
					c+=(c1*(c1-1))/2;
				}
				else
				{
					c+=(c1*c2);
				}
			}
		}
		return c;
	}
	public static void main(String... args)
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