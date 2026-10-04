import java.util.*;
public class AntiClockWise1 {
	public static void main(String...args) 
	{
        	Scanner sc =new Scanner(System.in);
        	System.out.println("enter no of elements : ");
        	int n=sc.nextInt();
        	ArrayList<Integer> a=new ArrayList<>();
        	for (int i = 0; i < n; i++)
            		a.add(sc.nextInt());
        	System.out.println("enter rotation number : ");
        	int r=sc.nextInt();
        	int c=a.size()-1;
        	while(r-->0) {
            		int q=a.get(0);
            		a.remove(0);
            		a.add(q);
        	}
        	System.out.println(a.toString());
    	}
}