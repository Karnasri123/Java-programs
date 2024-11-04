package filewriter;

public class stdcontroller {

	public static void main(String[] args) {
		studentpojo a=new studentpojo();
		a.setSid(8);
		a.setSname("raji");
		a.setSage(24);
		a.setSmarks(99.5);
		a.setSqual("mca");
		
		file f= new file();
		f.write(a);

	}

}
