import java.util.*;
class AscendOfn
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
		li.sort(null);
		System.out.println(li);
		System.out.println("Descending order:");
		li.sort((x,y)->y-x);
		System.out.println(li);
	}
}
