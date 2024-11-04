package overriding;

public class child extends parent {
	@Override
	 public void m1(int h)//static/private methods cannot be over rided.
	{
		System.out.println("child loacal calss");//parent class method with default can increase to protect and public in child class
	}

	 public int m2(int a)//we can increase the scope of the method access but to decrease in child class.
	{
		System.out.println("child class");//scope to increase method access is :public>protect>default.
		return 3;
	}

	public static void main(String[] args) {
		child a=new child();
		a.m1(1);//same parameters should be passed within the parent and child incase of overiding
		a.m2(2);//return type cannot be changed in overriding
		
	}

}
