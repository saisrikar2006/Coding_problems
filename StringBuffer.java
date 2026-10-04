import java.util.*;
class StringBuffer
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string:");
		StringBuffer s = new StringBuffer(sc.next());						System.out.println("enter number to delete particular char in string:");
		int n= sc.nextInt();
		s.deleteCharAt(n);
		System.out.println("after deleting a single char in string:"+s);
		System.out.println("enter range to delete some chars in string:");
		int l=sc.nextInt();
		int h=sc.nextInt();
		s.delete(l,h);
		System.out.println("after deleting a multi chars in string:"+s);
	}
}	

