import java.util.*;
class Hashs3
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
			hs.add(arr[i]);
		}
		if(n==hs.size())
		System.out.println(true);
		else
		System.out.println(false);
	}
}

		