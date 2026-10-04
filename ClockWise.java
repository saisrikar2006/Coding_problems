import java.util.*;
public class ClockWise {
    static void clk(int []a,int r){
        int []a1=new int[a.length];
        int j=0;
        for (int i = (a.length-r); i <a.length ; i++) {
            a1[j++]=a[i];
        }
        for(int i=0;i<(a.length-r);i++){
            a1[j++]=a[i];
        }
        for(int y:a1) System.out.print(y);
    }
    public static void main(String...args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no of elements : ");
        int n=sc.nextInt();
        int [] a=new int[n];
        for (int i = 0; i < n; i++)
            a[i]=sc.nextInt();
        System.out.println("enter rotation number : ");
        int r=sc.nextInt();
        clk(a,r);
    }
}