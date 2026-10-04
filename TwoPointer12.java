import java.util.*;
class TwoPointer12
{
	static int[] is3sum(int a[],int n,int target)
	{
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			HashSet<Integer> hs=new HashSet<>();
			for(int j=i+1;j<n-1;j++)
			{
				int x=target-a[i]-a[j];
				if(hs.contains(x))
					return new int[]{x,a[i],a[j]};
				hs.add(a[j]);
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
