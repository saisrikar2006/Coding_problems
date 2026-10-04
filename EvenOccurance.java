import java.util.Scanner;
import java.util.TreeMap;

public class EvenOccurance {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter size of the array: ");
    int n =s.nextInt();
    int a[]=new int[n];
    System.out.println("enter the array elements : ");
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
     TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i]))    map.put(a[i], map.get(a[i]) + 1);
             else  map.put(a[i], 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key)% 2 == 0) {
                System.out.println(key + " - " + map.get(key));
                return;
            }
        }
        System.out.println(-1);
    }
}