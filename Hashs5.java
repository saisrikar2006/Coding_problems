import java.util.*;
class Hashs5
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> hm=new HashMap<>();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(hm.containsKey(arr[i]))
			hm.put(arr[i],hm.get(arr[i])+1);
			else
			hm.put(arr[i],1);
		}
		for(int i=0;i<n;i++)
		{
			if(hm.get(arr[i])>=2)
			{
				System.out.println(false);
				System.exit(0);
			}	
		}
		System.out.println(true);
	}
}

		