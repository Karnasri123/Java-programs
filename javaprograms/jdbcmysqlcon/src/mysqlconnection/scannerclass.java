package mysqlconnection;

import java.util.Scanner;

public class scannerclass {

	public static void main(String[] args) {
		preparesta s= new preparesta();
		Scanner sc=new Scanner(System.in);
		System.out.println("choose option");
		String option=sc.nextLine();
		switch(option)
		{
		case "insert":
			System.out.println("insert data in to table");
			System.out.println("enter student id--");
			int sid=sc.nextInt();
			System.out.println("enter student name--");
			String sname=sc.next();
			System.out.println("enter student age");
			int sage=sc.nextInt();
			System.out.println("enter student marks--");
			double smarks=sc.nextDouble();
			System.out.println("enter student location--");
			String sloc=sc.next();
			s.insertdata(sid, sname, sage, smarks, sloc);
			break;
		case "update":
			System.out.println("update student data");
			System.out.println("enter student location--");
			String sloca=sc.nextLine();
			System.out.println("enter student name--");
			String snames=sc.nextLine();
			System.out.println("enter student id--");
			int sidd=sc.nextInt();
			s.updatedata(sloca, snames, sidd);
			break;
		case "delete":
			System.out.println("delete student data");
			System.out.println("enter student id--");
			int dsid=sc.nextInt();
			s.deletedata(dsid);
			break;
		default:
			System.out.println("choose correct option to changes data of student");
			
		}
		}
		

	}


