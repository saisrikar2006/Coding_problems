import java.util.*;
public class Largest1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size  ");
        int n =s.nextInt();
        int a[]=new int[n];
    System.out.println("enter the array elements : ");
    int max=0;
	for(int i=0;i<n;i++)
	{
          a[i]=s.nextInt();
          if(a[i]>max)
          max=a[i];
      	}       
        System.out.print("Largest Element is: "+max);
    }
}