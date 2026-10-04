class MyThread extends Thread 
{
   	 public void run() 
{
        	for (int i = 1; i <= 3; i++) 
{
            		System.out.println(Thread.currentThread().getName() + " : " + i);
            		try
 {
               		 Thread.sleep(500);
            		} catch (InterruptedException e) {
               	 System.out.println(e);
            	}
        }
    }
}

class ThreadDemo {
    public static void main(String args[]) 
{
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

        System.out.println("t1 is alive: " + t1.isAlive());
        System.out.println("t2 is alive: " + t2.isAlive());

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("t1 is alive after join: " + t1.isAlive());
        System.out.println("t2 is alive after join: " + t2.isAlive());
    }
}

