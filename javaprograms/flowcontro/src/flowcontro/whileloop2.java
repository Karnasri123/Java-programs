package flowcontro;

public class whileloop2 {

	public static void main(String[] args) {
	int j=1;
	while(j<=5)
	{
		System.out.println("print==============="+j);
	int i=1;
		while(i<=10)
		{
			System.out.println("print==="+(i*j));
			i++;
		}
		j++;
	}

	}

}