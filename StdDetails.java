class StdDetails
{
    public static void main(String args[])
    {
       System.out.println("student name:"+args[0]);
       System.out.println("regd number:"+args[1]);
       System.out.println("branch:"+args[2]);
       int sum=Integer.parseInt(args[3])+Integer.parseInt(args[4])+Integer.parseInt(args[5]);
       float per=((sum)/300)*100;
       System.out.println("percentage marks:"+per);
   }
}