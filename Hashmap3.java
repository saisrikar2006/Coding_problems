import java.util.*;
class Hashmap3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(a[i]))
            {
                hm.put(a[i],hm.get(a[i])+1);
            }
            else
            hm.put(a[i],1);
        }
        Set<Integer> s=hm.keySet();
        for(int k:s)
        {
            System.out.println(k+" "+hm.get(k));
        }
    }
}