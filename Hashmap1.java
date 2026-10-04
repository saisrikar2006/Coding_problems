import java.util.*;
class Hashmap1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of pairs");
        int n=sc.nextInt();
        HashMap<String,Double> hm=new HashMap<>();
        System.out.println("Enter key and value pairs");
        for(int i=1;i<=n;i++)
        {
            String s1=sc.next();
            Double cgpa=sc.nextDouble();
            hm.put(s1,cgpa);
        }
        Set<String> s=hm.keySet();
        System.out.println("Name   cgpa");
        for(String k:s)
        {
            System.out.println(k+" "+hm.get(k));
        }
    }
}