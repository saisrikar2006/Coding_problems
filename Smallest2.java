import java.util.*;
public class Smallest2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of the Heap: ");
        int n =s.nextInt();
        int a[]=new int[n];
    System.out.println("enter the array elements : ");
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
     }
     int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Smallest element: " + min);
    }
}