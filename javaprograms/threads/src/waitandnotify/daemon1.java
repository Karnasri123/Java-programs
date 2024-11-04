package waitandnotify;

public class daemon1 extends Thread {
	public void run()
	{
	 for(int i=1;i<=10;i++)
	 {
		 try {
			Thread.sleep(3000);
			System.out.println("values--------"+i+" "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 
	 }
	}

	public static void main(String[] args) {
		daemon1 e=new daemon1();
 e.setDaemon(true);//after completion of main thread task it will goes to dead state then automatically all threads goes to end
		e.start();// back(daemon) threads run until main thread runs
		          // it false thread continuestion is run
		for(int i=1;i<=10;i++)
        {
			try {
				Thread.sleep(1000);
				System.out.println("values------"+i+" "+Thread.currentThread().getName());
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	
        }
		

	}

}
