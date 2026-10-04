import java.util.*;
public class Leader1 {
    
	public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array:");
        int n=sc.nextInt();
        System.out.println("Enter the Array elements:");
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int t=0;
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            int max=ar[i];
            for(int j=i+1;j<n;j++){
                if(max<ar[j]) {
                    max=ar[j];
                }
            }
            if(max==ar[i])
                l.add(max);
        }
        for(Integer x:l){
            System.out.print(x+" ");
        }
    }
}