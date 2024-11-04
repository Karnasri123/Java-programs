package filesaveandread;
import java.util.*;

public class testdata {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		student s=new student();
		studentcontroler std=new studentcontroler();
		boolean turn=true;
		while(turn)
		{
		System.out.println("option for to write data in file--1");
		System.out.println("data to be read by sid---2");
		System.out.println("data to be read by sname enter----3");
		System.out.println("all data read enter--4");
	
		int choiceofenter=b.nextInt();
		switch(choiceofenter)
		{
		case 1:
		System.out.println("enter data to be saved---");
		boolean con=true;
		while(con)
		{
		System.out.println("enter student sid");
		int sid=b.nextInt();
		boolean flag=std.getbyid1(sid);
		System.out.println("wait we are checking enter id already exist are not");
		if(flag==true)
		{
		System.out.println("enter student name---");
		String sname=b.next();
		System.out.println("enter student age---");
		int sage=b.nextInt();
		System.out.println("enter student marks--");
		double smarks=b.nextDouble();
		System.out.println("enter student qual--");
		String squal=b.next();
		s=new student(sid,sname,sage,smarks,squal);
		std.save(s);
		}else
		{
			System.out.println("the id entered is already exists");
		}
		System.out.println("enter true to continue or false to discontinue");
		con=b.nextBoolean();
		}
		
				break;
		case 2:
			System.out.println("enter id to read data");
			std.getbyid(b.nextInt());
			break;
		case 3:
			System.out.println("reading data by name---");
			std.getbyname(b.next());
			break;
		case 4:
			System.out.println("reading all students data---");
			std.getall();
			break;
		default:
			System.out.println("please select proper choice");
			
		}
		System.out.println("enter true to continue in program or false to discontinue");
		turn=b.nextBoolean();
		}
		
	}

}
