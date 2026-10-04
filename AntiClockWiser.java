import java.util.*;
public class AntiClockWiser {
        public static void main(String...args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no of elements : ");
        int n=sc.nextInt();
        int [] a=new int[n];
        for (int i = 0; i < n; i++)
            a[i]=sc.nextInt();
	int t=a[0];

	for(int i=0;i<n-1;i++)
	{
		a[i]=a[i+1];
	}
	a[n-1]=t;
	for(int i:a)
        System.out.print(i+" ");
       
    }
}