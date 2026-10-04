import java.util.*;
class StringBufferDemo 
{
    	public static void main(String... args)
	{
        	Scanner sc = new Scanner(System.in);
     		System.out.println("Enter string:");
        	StringBuffer s = new StringBuffer(sc.next()); 
        	System.out.println("Enter index to delete a particular character:");
        	
        	s.deleteCharAt(5);
        	System.out.println("After deleting a single character: " + s);
		System.out.println("Enter range (start and end) to delete multiple characters:");
        	int l = sc.nextInt();
        	int h = sc.nextInt();
        	s.delete(l, h);
        	System.out.println("After deleting multiple characters: " + s);
    	}
}
