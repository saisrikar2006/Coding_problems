import java.util.*;
class Scan
{
    public static void main(String args[])
    {
       byte b; short s; int i; long l; float f; double d; String st; char ch; boolean bo;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter byte value");
       b=sc.nextByte();
       System.out.println("enter short value");
       s=sc.nextShort();
       System.out.println("enter int value");
       i=sc.nextInt();
       System.out.println("enter long value");
       l=sc.nextLong();
       System.out.println("enter float value");
       f=sc.nextFloat();
       System.out.println("enter double value");
       d=sc.nextDouble();
       System.out.println("enter boolean value");
       bo=sc.nextBoolean();
       System.out.println("enter string");
       st=sc.next();
       System.out.println("enter character");
       ch=sc.next().charAt(0);
       System.out.println("given value of byte is"+b);
       System.out.println("given value of short is"+s);
       System.out.println("given value of int is"+i);
       System.out.println("given value of long is"+l);
       System.out.println("given value of float is"+f);
       System.out.println("given value of double is"+d);
       System.out.println("given string is"+st);
       System.out.println("given char is"+ch);
       System.out.println("given value of boolean is"+bo);
     }
}
