class Customer
{
	int balance=100000;
	synchronized void withdraw(int amount)
	{
		System.out.println("going to withdraw");
		if(amount>balance)
		{
			System.out.println("waiting for deposit");
			try
			{
				wait();
			}
			catch(Exception e){}
			balance-=amount;
			System.out.println("withdrawal done");

		}
		else
		{
			balance-=amount;
			System.out.println("withdrawal done");
		}
	}
	synchronized void deposit(int amount)
	{
		System.out.println("going to deposit");
		balance+=amount;
		System.out.println("deposit done");
		notify();
	}
	synchronized void show()
	{
		System.out.println("your account balance is:"+balance);
	}

}
class InterThreadComDmo
{
	public static void main(String... args)
	{
		final Customer c1 = new Customer();
		Thread t1=new Thread(){
			public void run(){
				c1.withdraw(150000);
				c1.show();
			}};
		Thread t2=new Thread(){
			public void run(){
				c1.deposit(150000);
				c1.show();
			}};
		t1.start();
		t2.start();
	}
}

