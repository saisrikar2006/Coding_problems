import java.util.*;
class Trees2
{
 	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TreeSet<String> ts=new TreeSet<>(Collections.reverseOrder());
		for(int i=0;i<n;i++)
		{
			String c=sc.next();
			ts.add(c);
		}
		System.out.println("Cities in TreeSet:");
		System.out.println("------------------");
		for(String x:ts)
		{
			System.out.println(x);
		}
	}
}
