class PrimeOrNot
{
     public static void main(String nums[])
     {
        int i,count=0,n=Integer.parseInt(nums[0]);
        for(i=1;i<=n/2;i++)
        {
           if(n%i==0)
           count++;
        }
        if(count==1)
         System.out.println(n+" is a prime number");
         else
         System.out.println(n+" is not a prime number");
     }
}