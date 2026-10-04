class Palindrome
{
      public static void main(String nums[])
      {
           int sum=0,temp;
           temp=Integer.parseInt(nums[0]);
           int n=temp;
           while(n!=0)
           {
               int k=n%10;
                   sum=sum*10+k;
                   n=n/10;
           }
           if(temp==sum)
           System.out.println(temp+" is a palindrome number");
           else
           System.out.println(temp+" is not a palindrome number");
       }
}