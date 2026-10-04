import java.util.Scanner;
public class Bitonic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size  ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements :  ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println((check(arr,n))?"bitonic":"not a bitonic");
    }
    static boolean check(int arr[],int n)
    {
        int i=0;
        while(i+1<n && arr[i]<arr[i+1])
            i++;
        while (i + 1 < n && arr[i] == arr[i + 1]) 
        i++;
        while(i+1<n && arr[i]>arr[i+1])
            i++;
        return i==n-1;
    }
}