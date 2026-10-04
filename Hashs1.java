import java.util.*;
class Hashs1
{
 	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashSet<String> hs=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			String c=sc.next();
			hs.add(c);
		}
		System.out.println("Cities in HashSet:");
		System.out.println("------------------");
		for(String x:hs)
		{
			System.out.println(x);
		}
	}
}
