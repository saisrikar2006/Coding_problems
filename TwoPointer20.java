import java.util.*;
class TwoPointer20
{
	static ArrayList<ArrayList<Integer>> is3sum(int a[],int n,int target)
	{
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			HashMap<Integer,Integer> hs=new HashMap<>();
			for(int j=i+1;j<n-1;j++)
			{
				ArrayList<Integer> li =new ArrayList<>();
				int x=target-a[i]-a[j];
				if(hs.containsKey(x)){
					li.add(x);
					li.add(a[i]);
					li.add(a[j]);
				}
				if(!li.isEmpty())
				res.add(li);
				hs.put(a[j],hs.getOrDefault(a[j],0)+1);
			}

		}
		return res;
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
		ArrayList<ArrayList<Integer>> res=is3sum(a,n,tar);
		System.out.println("Output:");
		for(ArrayList<Integer> i:res)
		{
			System.out.println(i+" ");
		}
	}
}
