package advance;

import java.util.Scanner;

public class empinfo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		employee emp=new employee();
		empcontroller e=new empcontroller();
		
		System.out.println("choose option");
		String option=sc.nextLine();
		switch(option)
		{
		case "insert":
			System.out.println("insert data in to table");
			System.out.println("enter emp id--");
			emp.setEid(sc.nextInt());
			System.out.println("enter emp name--");
			emp.setEname(sc.next());
			System.out.println("enter emp esal");
			emp.setEsal(sc.nextDouble());
			System.out.println("enter emp desg--");
			emp.setEdesg(sc.next());
			System.out.println("enter emp loc--");
			emp.setEloc(sc.next());
			e.save(emp);
			break;
		case "update":
			System.out.println("update emp data");
			System.out.println("enter emp location--");
			String eloca=sc.nextLine();
			System.out.println("enter emp name--");
			String edesgs=sc.nextLine();
			System.out.println("enter emp id--");
			int eidd=sc.nextInt();
			e.update(eloca,edesgs,eidd);
			break;
		case "delete":
			System.out.println("delete emp data");
			System.out.println("enter emp id--");
			int eeid=sc.nextInt();
			e.delete(eeid);
			break;
		case "getid":
			System.out.println("get emp data by id");
			System.out.println("enter emp id");
			int gid=sc.nextInt();
			e.getbyid(gid);
			break;
		case "getall":
			System.out.println("get all emp data");
			e.getall();
			break;
		
		default:
			System.out.println("choose correct option to changes data of student");
			
		}
		}

	}


