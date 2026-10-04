import java.util.*;
public class AntiClockWiser1 {
	public static void main(String...args) 
	{
        	Scanner sc =new Scanner(System.in);
        	System.out.println("enter no of elements : ");
        	int n=sc.nextInt();
        	ArrayList<Integer> a=new ArrayList<>();
        	for (int i = 0; i < n; i++)
            		a.add(sc.nextInt());
               	int c=0;
       		int q=a.get(c);
            	a.remove(c);
            	a.add(q);
        	System.out.println(a.toString());

}