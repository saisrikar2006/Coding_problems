import java.util.*;
class UpperLowerClass
{
    public static void main(String nums[])
    {
        int ucl=0,lcl=0,dtl=0;String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            boolean uc=Character.isUpperCase(ch);
            boolean lc=Character.isLowerCase(ch);
            boolean dc=Character.isDigit(ch);
            if(uc)
            ucl++;
            else if(lc)
            lcl++;
            else if(dc)
            dtl++;
            else
               ;
        }
        System.out.println("uppercase letters in the given string is "+ucl);
        System.out.println("lowercase letters in the given string is "+lcl);
        System.out.println("digits in the given string is "+dtl);
     }
}