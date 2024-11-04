package flowcontro;

public class elseifmarks {

	public static void main(String[] args) {
		double marks=101;
		if(marks<=34)
		{
			System.out.println("std fail");
		}
		else if(marks>=35&&marks<=55)
		{
			System.out.println("std got C grade");
		}
		else if(marks>=56&&marks<=70)
		{
			System.out.println("std got B grade");
		}
		else if(marks>=71&&marks<=90)
		{
			System.out.println("std got A grade");
		}
		else if(marks>=91&&marks<=100)
		{
			System.out.println("std got A+");
		}
		else
		{
			System.out.println("no marks");
		}

	}

}
