import java.util.*;
public class RepeatMiss1 
{
    	public static void main(String[] args) 
	{
        	Scanner s = new Scanner(System.in);
        	System.out.print("Enter the size of array:");
        	int n=s.nextInt();
         	System.out.print("Enter the values:");
         	int a[]=new int[n];
        	for (int i = 0; i < n; i++) {
            		a[i]=s.nextInt(); 
        	}
        	HashMap<Integer,Integer> h = new HashMap<>();
        	for(int i=0;i<n;i++){
            		h.put(a[i], h.getOrDefault(a[i], 0) + 1);
        	}
        	for (int i = 1; i <= n; i++) {
            		if (!h.containsKey(i)) 
                		System.out.println("Missing element: " + i);
             		if (h.getOrDefault(i, 0) > 1) 
                		System.out.println("Repeating element: " + i);
        	}
    	}
}
