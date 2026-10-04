import java.util.*;
class TwoPointer9
{
	static boolean is3sum(int a[],int n,int target)
	{
		for(int i=0;i<n;i++)
		{
			HashMap<Integer,Integer> hs=new HashMap<>();
			for(int j=i+1;j<n-1;j++)
			{
				int x=target-a[i]-a[j];
				if(hs.containsKey(x))
					return true;
				hs.put(a[j],hs.getOrDefault(a[j],0)+1);
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
