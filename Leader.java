import java.util.*;
public class Leader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array:");
        int n=sc.nextInt();
        System.out.println("Enter the Array elements:");
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int max=ar[n-1];
        ArrayList<Integer> l=new ArrayList<>();
        l.add(ar[n-1]);
        for(int i=n-2;i>=0;i--){
            if(ar[i]>max) {
                max = ar[i];
                l.add(ar[i]);
            }
        }
        Collections.sort(l,Collections.reverseOrder());
        for(Integer x:l){
            System.out.print(x+" ");
        }
    }
}