import java.util.*;
class Vowels
{
    public static void main(String args[])
    {
       int i=0,vc=0,cc=0;char ch;String s;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your string");
       s=sc.next();
       for(i=0;i<s.length();i++)
       {
         if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
          vc++;
          else
          cc++;
       }
     System.out.println("number of vowels in the given string is"+vc);
     System.out.println("number of constants in the given string is"+cc);
    }
}