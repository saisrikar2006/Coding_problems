import java.util.Arrays;
import java.util.Scanner;
public class Smallest3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size  ");
        int n =s.nextInt();
        int a[]=new int[n];
    System.out.println("enter the array elements : ");
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
     }
        Arrays.sort(a);
        System.out.println("Smallest element: " + a[0]);
    }
}