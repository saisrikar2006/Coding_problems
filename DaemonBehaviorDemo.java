class DaemonBehaviorDemo extends Thread
{ 
    	public void run() 
	{ 
        	while (true) 
		{ 
            		System.out.println("Daemon thread running..."); 
       		} 
    	} 
    	public static void main(String[] args) 
	{ 
        	DaemonBehaviorDemo t = new DaemonBehaviorDemo(); 
        	t.setDaemon(true); 
        	t.start(); 
        	System.out.println("Main (user) thread ends..."); 
    	}	 
} 