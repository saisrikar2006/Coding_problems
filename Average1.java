import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size  ");
        int n=sc.nextInt();
        System.out.println("enter x value:  ");
        int x=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements :  ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        HashMap<Integer,Integer> h=new HashMap<>();
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int t=(arr[i]+x)/2;
            ans[i]=t;
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++)
        {
            if(h.containsKey(ans[i]))  ans[i]=h.get(ans[i]);
            else ans[i]=0;
        }
        System.out.println(Arrays.toString(ans));
    }
}