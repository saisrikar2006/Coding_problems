import java.util.*;
class Ascn
{
	public static void main(String...args)
	{
		ArrayList<Integer> li=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			li.add(sc.nextInt());
		}
		System.out.println("Orginal List:");
		System.out.println(li);
		System.out.println("Ascending Order:");
		Collections.sort(li);
		System.out.println(li);
		System.out.println("Descending order:");
		Collections.sort(li,(x,y)->y-x);
		System.out.println(li);
	}
}
