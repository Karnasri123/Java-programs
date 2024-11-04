package waitandnotify;

public class join extends Thread {
	public void run()
	{
	 for(int i=1;i<=10;i++)
	 {
		 try {
			Thread.sleep(2000);
			System.out.println("values--------"+i+" "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
	}

	public static void main(String[] args) {
		join d=new join();
		
		d.start();
        join d1=new join();
       // d1.start();  here thread0 and thread1 runs parallarly. main thread cannot wait for thread1
        try {
			d.join();//join keyword waits the main thread until created thread0 over.
			d1.start();//threads runs one after another 
			d1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        for(int i=10;i>=1;i--)
        {
        	System.out.println("values------"+i+" "+Thread.currentThread().getName());
        }
		

	}
}
