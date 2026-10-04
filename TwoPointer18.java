import java.util.*;
class TwoPointer18
{
	static ArrayList<ArrayList<Integer>> is3sum(int a[],int n,int target)
	{
		Arrays.sort(a);
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
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
					ArrayList<Integer> li=new ArrayList<>();
					li.add(a[l]);
					li.add(a[r]);
					li.add(a[i]);
					l++;
					r--;
					if(!li.isEmpty())
						res.add(li);

					while(l < r && a[l] == a[l-1]) l++;
    					while(l < r && a[r] == a[r+1]) r--;	
				}
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
