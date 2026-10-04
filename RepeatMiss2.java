import java.util.*;
public class RepeatMiss2
{
    	public static void main(String[] args) {
        	Scanner s = new Scanner(System.in);
        	System.out.println("Enter size of the array: ");
        	int n=s.nextInt();
        	int ar[]=new int[n];
        	for(int i=0;i<n;i++){
            		ar[i]=s.nextInt();
        	}
       		int a[]= new int[n+1];
       		for(int i=0;i<n;i++){
        		a[ar[i]]++;
       		}
       		for(int i=1;i<=n;i++){
        	if(a[i]==2)
             		System.out.println("Duplicate:"+i);
        	if(a[i]==0)
          		System.out.println("Missing:"+i);
    		}
    	}
}