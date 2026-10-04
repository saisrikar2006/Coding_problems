class LargestAT
{
    public static void main(String nums[])
    {
      int big=0;
       for(int i=0;i<nums.length;i++)
         if(big<Integer.parseInt(nums[i]))
           big=Integer.parseInt(nums[i]);
       System.out.println("biggest number given numbers is "+big);
    }
}