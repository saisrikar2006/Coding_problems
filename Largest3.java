import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of the Heap: ");
        int n =s.nextInt();
        int a[]=new int[n];
    System.out.println("enter the array elements : ");
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
    for(int i=0;i<n;i++){
            pq.add(a[i]);
     }
        System.out.println("Largest element:" +pq.peek());
    }
}