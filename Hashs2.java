import java.util.*;
class Hashs2
{
 	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		for(int i=0;i<n;i++)
		{
			String c=sc.next();
			lhs.add(c);
		}
		System.out.println("Cities in LinkedHashSet:");
		System.out.println("------------------");
		for(String x:lhs)
		{
			System.out.println(x);
		}
	}
}
