import java.util.*;
class Hashmap2
{
   public static void main(String... args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter n value:");
     int n=sc.nextInt();
     HashMap<String,Double> map=new HashMap<>();
     for(int i=1;i<=n;i++)
     {
         String name=sc.next();
         double cgpa=sc.nextDouble();
         map.put(name,cgpa);
     }
     
     System.out.println("-----------------------Output------------------------\n");
     for(Map.Entry<String,Double> res: map.entrySet())
     {
         System.out.println(res.getKey()+" : "+res.getValue());
     }
   }
}