package flowcontro;

public class dowhile1 {

	public static void main(String[] args) {
		int i=1;
		int j;
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

}
