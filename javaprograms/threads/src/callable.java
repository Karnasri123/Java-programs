import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class callable implements Callable<Integer> {
	
	public static int tikets=100;
	public Integer call()//callable contains submit method it calls call method which is overrided in our class
	{
		tikets=tikets-1;
		System.out.println(Thread.currentThread().getName()+" "+tikets);
		return tikets;
	}

	public static void main(String[] args) {
		callable c=new callable();
	ExecutorService es= Executors.newFixedThreadPool(3);// callable is interface which si used to create pool.
	
	for(int i=1;i<=10;i++)
	{
		Future<Integer>data=es.submit(c);//future is a data type of a submit with parameter
		try {
			System.out.println(data.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	/*es.submit(c);
	es.submit(c);
	es.submit(c);
	es.submit(c);
	es.submit(c);
	es.submit(c);
	es.submit(c);
	es.submit(c);
	es.submit(c);
	es.submit(c);
	es.submit(c);*/
		

	}

}
