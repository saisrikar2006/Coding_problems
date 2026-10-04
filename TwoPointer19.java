import java.util.*;
class TwoPointer19
{
	static ArrayList<ArrayList<Integer>> is3sum(int a[],int n,int target)
	{
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			HashSet<Integer> hs=new HashSet<>();
			for(int j=i+1;j<n-1;j++)
			{
				ArrayList<Integer> li =new ArrayList<>();
				int x=target-a[i]-a[j];
				if(hs.contains(x)){
					li.add(x);
					li.add(a[i]);
					li.add(a[j]);
				}
				if(!li.isEmpty())
				res.add(li);
				hs.add(a[j]);
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
