public class DameonDemo1 extends Thread 
{
    	public void run() 
	{
        	if (Thread.currentThread().isDaemon()) 
		{
            		System.out.println("Daemon thread running...");
        	} 	
		else 
		{
            		System.out.println("User thread running...");
        	}
    	}

    	public static void main(String[] args) 
	{
        	DameonDemo1 t1 = new DameonDemo1();
        	DameonDemo1 t2 = new DameonDemo1();
        	t1.setDaemon(true); 
       	 	t1.start();
        	t2.start();
    	}
}