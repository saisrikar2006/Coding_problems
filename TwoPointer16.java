import java.util.*;
class TwoPointer16
{
	static int[] is3sum(int a[],int n,int target)
	{
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			HashMap<Integer,Integer> hs=new HashMap<>();
			for(int j=i+1;j<n-1;j++)
			{
				int x=target-a[i]-a[j];
				if(hs.containsKey(x))
					return new int[]{hs.get(x),i,j};
				hs.put(a[j],j);
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
