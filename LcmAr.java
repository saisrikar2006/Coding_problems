import java.util.*;
class Sample
{
	public static void main(String...args)
    	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			hm.add(a[i]);
		}
		for(int i:hm)
		System.out.print(i+"  ");
    	}
}