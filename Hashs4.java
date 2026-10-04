import java.util.*;
class Hashs4
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashSet<Integer> hs=new HashSet<>();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(hs.contains(arr[i]))
			{
				System.out.println(false);
				System.exit(0);
			}
			hs.add(arr[i]);
		}
		System.out.println(true);
	}
}

		