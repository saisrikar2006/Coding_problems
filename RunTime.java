class Bank
{
 void interest()
{
        		System.out.println("bank interest 7%");
    	}
}
class SBI extends Bank
{
   	 void interest()
{
        		System.out.println("SBI bank interest 8.1%");
    	}
}
class HDFC extends Bank
{
  	 void interest()
{
  	      System.out.println("HDFC bank interest 9%");
    	}
}
class AXIS extends Bank
{
   	 void interest()
{
        		System.out.println("AXIS bank interest 10%");
    	}
}
class RunTime
{
    	public static void main(String...args)
{
        	 Bank b;
      		 b=new Bank();
       		 b.interest();
        	 b=new SBI();
       		 b.interest();
       		 b=new HDFC();
       		 b.interest();
       		 b=new AXIS();
       		 b.interest();
    	}
} 

