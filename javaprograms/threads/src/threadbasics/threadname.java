package threadbasics;

public class threadname {
	public void m1() {
		int i=10;
		while(i>=6)
		{
		System.out.println("value=="+i+"-----thread name=="+Thread.currentThread().getName());
		i--;
		}
	}

	public static void main(String[] args) {
		System.out.println("thread name------"+Thread.currentThread().getName());
        for(int i=0;i<=5;i++)
        {
        	System.out.println("value=="+i+"----- threadname=="+Thread.currentThread().getName());
        }
        System.out.println("---------------------------------------------------------");
        threadname t=new threadname();
        t.m1();
	}

}
