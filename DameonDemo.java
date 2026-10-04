public class DameonDemo extends Thread 
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
        	DameonDemo t1 = new DameonDemo();
        	DameonDemo t2 = new DameonDemo();
        	t1.setDaemon(true); 
       	 	t1.start();
        	t2.start();
    	}
}