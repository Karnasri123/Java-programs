
public class staticmethod {
	int h=10;
	static int k=20;

	public static void main(String[] args) {
		staticmethod a=new staticmethod();
		System.out.println(a.h);
		System.out.println(staticmethod.k);
		a.h=25;
		staticmethod.k=45;
		System.out.println(a.h);
		System.out.println(staticmethod.k);
		staticmethod b=new staticmethod();
		System.out.println(b.h);
		System.out.println(staticmethod.k);
		
		//for creation of new object value is taken in class not existing value present in previous object;

	}

}
