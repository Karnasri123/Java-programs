package com.slokam1;

public class test2 {
	
	private int sid;
	private String sname;
	private String sloc;
	private double smarks;
	private int sage;
	
	public void setsid(int id)
	{   //logic
		this.sid=id;
	}
	public int getsid()
	{
		return this.sid;
	}
	public void setsname(String name)
	{   //logic
		this.sname=name.trim();
	}
	public String getsname()
	{
		return this.sname;
	}
	public void setsloc(String loc)
	{  //logic
		this.sloc=loc;
	}
	public String getsloc()
	{
		return this.sloc;
	}
	public void setsage(int age)
	{  //logic
		this.sage=age;
	}
	public int getsage()
	{
		return this.sage;
	}
	public void setsmarks(double marks)
	{  //logic
		this.smarks=marks;
	}
	public double getsmarks()
	{
		return this.smarks;
	}
	
	
	

	public static void main(String[] args) {
		
	}

}
