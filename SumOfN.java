class SumOfN
{
     public static void main(String nums[])
     {
         int i,sum=0;
         for(i=0;i<nums.length;i++)
         {
            sum+=Integer.parseInt(nums[i]);
         }
         System.out.println("sum of all given numbers is"+sum);
     }
}