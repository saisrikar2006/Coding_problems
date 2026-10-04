import java.util.*;

public class Heap5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of the Heap: ");
        int n =s.nextInt();
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        System.out.println("enter the elements : ");
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            pq.add(a);
        }
        while (!pq.isEmpty()) {
             System.out.print(pq.poll() + " ");
        }
    }
}