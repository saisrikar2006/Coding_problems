import java.util.*;
import java.lang.*;
class TwoPointer3
{
	public static int targetPairs(int a[],int n,int target)
	{
		int c=0;
		int l=0,r=n-1;
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int x=target-a[i];
			if(hm.containsKey(x))
			{
				c+=hm.get(x);
			}
			hm.put(a[i],hm.getOrDefault(a[i],0)+1);
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