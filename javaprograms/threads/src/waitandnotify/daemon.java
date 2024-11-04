package waitandnotify;

public class daemon {
	//daemon threads are thread that run back side
	// main thread is non daemon thread

	public static void main(String[] args) {
		System.out.println("thread name----"+Thread.currentThread().getName());
		for(int i=1;i<=10;i++)
		{   
			daemon d=new daemon();//object created in heap memory goes to garbage collector after one iteration.
			System.out.println("values-----"+i+" "+Thread.currentThread().getName());
		}

	}

}
