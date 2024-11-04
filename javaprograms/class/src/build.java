
public class build {
	int height;
	int width;
	int rooms;
	String col;
	String rawtype="bharathi cement";
	String name;
	int num;
	public static void main(String[] args) {
		build s=new build();
		s.height=30;
		s.width=20;
		s.rooms=4;
		s.col="violetblue";
		s.num=1;
		s.name="srikanth nilayam";
		System.out.println("building number=="+s.num);
	System.out.println("height=="+s.height);
	System.out.println("width=="+s.width);
	System.out.println("no.of rooms=="+s.rooms);
	System.out.println("color=="+s.col);
	System.out.println("cement=="+s.rawtype);
	System.out.println("building name=="+s.name);
	System.out.println("address=="+s);
	System.out.println("=================================");
	build t=new build();
	t.height=35;
	t.width=25;
	t.rooms=5;
	t.col="blue";
	t.num=2;
	t.name="Raji nilayam";
	System.out.println(t.num);
	System.out.println(t.height);
	System.out.println(t.width);
	System.out.println(t.rooms);
	System.out.println(t.col);
	System.out.println(t.rawtype);
	System.out.println(t.name);
	System.out.println(t);


}
}
