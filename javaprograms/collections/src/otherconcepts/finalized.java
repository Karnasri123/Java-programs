package otherconcepts;

public class finalized {

	public static void main(String[] args) {
		
		/*System.out.println("hii");
		emp e=new emp();// now this will move to garbage collector
		e=null;//jvm creates  garbage collector thread to remove unnecessary things
		System.gc();
		System.out.println("hello");*/
		emp e1= new emp();//now this object will go to garbage collector
		emp e2= new emp();//because e1 reference will replaced by e2 so e1 will be unnecessary object
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println("----------------------------------------------");
		e1=e2;
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		// now these two objects applicable to garbage collector
		

	}

}
