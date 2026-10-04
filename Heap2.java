import java.util.*;

public class Heap2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of the Heap: ");
        int n =s.nextInt();
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        System.out.println("enter the elements : ");
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            pq.add(a);
        }
        Iterator<Integer> it=pq.iterator();
        while (it.hasNext()) {
            int y =it.next();
            System.out.print(y+" ");
        }
    }
}