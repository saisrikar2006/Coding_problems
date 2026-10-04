class Armstrong
{
      public static void main(String nums[])
      {
          int sum=0,temp;
           temp=Integer.parseInt(nums[0]);
           int n=temp;
           while(n!=0)
           {
               int a=n%10;
                sum+=a*a*a;
                n=n/10;
           }
           if(sum==temp)
           System.out.println(temp+" is a armstrong number");
           else
           System.out.println(temp+" is not a armstrong number");
       }
}

