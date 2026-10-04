import java.util.*;
class TwoPointer8
{
	static boolean is3sum(int a[],int n,int target)
	{
		for(int i=0;i<n;i++)
		{
			HashSet<Integer> hs=new HashSet<>();
			for(int j=i+1;j<n-1;j++)
			{
				int x=target-a[i]-a[j];
				if(hs.contains(x))
					return true;
				hs.add(a[j]);
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
