package waitandnotify;

// deadlock is a problem where it appear in synchronization
// sos we have to sure on deadlock and performance while dealing with synchronization
// deadlock is problem where one thread is waiting for others thread without knowingly
public class deadlock {
	final String boy="sri";
	final String girl="raji";
	public void m1() {
		System.out.println("m1 method call-----"+Thread.currentThread().getName());
		synchronized(boy)
		{
			System.out.println("iam in m1 method call"+boy);
			try {
				Thread.sleep(20000);
				System.out.println("out  of sleep state of m1 method");
				synchronized(girl)
				{
					System.out.println("iam in m1 method call"+girl);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
     
	public void m2() {
		System.out.println("m2 method call-----"+Thread.currentThread().getName());
		synchronized(girl)
		{
			System.out.println("iam in m2 method call"+girl);
			try {
				Thread.sleep(2000);
				
				System.out.println("out  of sleep state of m2 method");
				synchronized(boy)
				{
					System.out.println("iam in m2 method call"+boy);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
					
			}
		}
	}
	public static void main(String[] args) {
		
		deadlock d=new deadlock();
		Thread t=new Thread() {
				public void run()
				{
			d.m1();
				}};
				t.start();
				Thread t1=new Thread() {
					public void run()
					{
				d.m2();
					}};
					t1.start();		
		

	}

}
