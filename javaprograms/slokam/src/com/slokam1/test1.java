package com.slokam1;

public class test1 {
	public static void main(String[] args) {
		test2 a=new test2();
		a.setsid(1);
		a.setsname("    srikanth");
		a.setsage(34);
		a.setsmarks(98.5);
		a.setsloc("andhra");
		/*int h=a.getsid();
		String n=a.getsname();
		String b=a.getsloc();
		int c=a.getsage();
		double d=a.getsmarks();*/
		System.out.println(a.getsid());
		System.out.println(a.getsname());
		System.out.println(a.getsage());
		System.out.println(a.getsmarks());
		System.out.println(a.getsloc());
		
		
		}

}
