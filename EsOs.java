class EsOs
{
    public static void main(String nums[])
    {
         int es=0,os=0;
         for(int i=0;i<nums.length;i++)
         if(Integer.parseInt(nums[i])%2==0)
            es=es+Integer.parseInt(nums[i]);
         else
            os=os+Integer.parseInt(nums[i]);
         System.out.println("odd sum and even sum is"+os+es);
     }
} 