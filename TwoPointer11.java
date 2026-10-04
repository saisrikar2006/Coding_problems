import java.util.*;
class TwoPointer11
{
	static int[] is3sum(int a[],int n,int target)
	{
		Arrays.sort(a);
		for(int i=0;i<n-2;i++)
		{
			int l=i+1,r=n-1;
			while(l<r)
			{
				int x=a[l]+a[r]+a[i];
				if(x<target)
				{
					l++;
				}
				else if(x>target)
				{
					r--;
				}
				else
				{
					return new int[]{a[l],a[r],a[i]};
				}
			}

		}
		return new int[]{-1,-1,-1};
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
		int[] res=is3sum(a,n,tar);
		System.out.println("Output:");
		for(int i:res)
		{
			System.out.print(i+" ");
		}
	}
}
