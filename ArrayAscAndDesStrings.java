import java.util.*;
class ArrayAscAndDesStrings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        Arrays.sort(arr);
        System.out.println("Asc order");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
	System.out.println();
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("Desc order");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}