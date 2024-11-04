
public class classmethod3 {
	int i=1;
	int j;
	void dowhile()
	{
	do
	{
		System.out.println("table========"+i);
		j=1;
		do {
			System.out.println(i+"*"+j+"="+(i*j));
			j++;
		}while(j<=10);
		i++;
	}while(i<=10);
	}

	public static void main(String[] args) {
	classmethod3 d=new classmethod3();
	d.dowhile();

	}

}
