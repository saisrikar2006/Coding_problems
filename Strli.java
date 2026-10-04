import java.util.*;
class Strli
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList <String> li=new ArrayList<>();
		System.out.println("Enter no.of strings:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			li.add(sc.next());
		}
		System.out.println("Orginal List:");
		System.out.println(li);
		System.out.println("Ascending Order:");
		li.sort(null);
		System.out.println(li);
		System.out.println("Descending order:");
		li.sort(Collections.reverseOrder());
		System.out.println(li);
	}
}