import java.util.*;

public class Heap3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of the Heap: ");
        int n =s.nextInt();
        PriorityQueue<String> pq= new PriorityQueue<>();
        System.out.println("enter the elements : ");
        for(int i=0;i<n;i++){
            String a=s.next();
            pq.add(a);
        }
        Iterator<String> it=pq.iterator();
        while (it.hasNext()) {
           String y =it.next();
            System.out.print(y+" ");
        }
    }
}