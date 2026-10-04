import java.util.*;
class Usi
{
	public static void main(String... args)
	{
   		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string:");
		String str=sc.nextLine();
		System.out.println("enter n value:");
		int n=sc.nextInt();
		for(int i=0;i<str.length();i++)
		{
			if(i%n==0)
			{
				i--;
				System.out.println();

			}
			else
			{
				System.out.print(str.charAt(i)+"\t");
			}
		}
	}
}