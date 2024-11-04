package com.slokam2;

public class employee1 {
	void addemp(employee[] emp)
	{
		for(int i=0;i<=emp.length-1;i++)
		{
			System.out.println(emp[i].eid+"==="+emp[i].ename+"==="+emp[i].esal+"==="+emp[i].edesg);	
		}
	/*System.out.println(emp[0].eid+"==="+emp[0].ename+"==="+emp[0].esal+"==="+emp[0].edesg);	
	System.out.println(emp[1].eid+"==="+emp[1].ename+"==="+emp[1].esal+"==="+emp[1].edesg);
	System.out.println(emp[2].eid+"==="+emp[2].ename+"==="+emp[2].esal+"==="+emp[2].edesg);
	System.out.println(emp[3].eid+"==="+emp[3].ename+"==="+emp[3].esal+"==="+emp[3].edesg);*/
	}
	public static void main(String[] args) {
		employee1 e=new employee1();
		employee a=new employee();
		a.eid=1;
		a.ename="raji";a.esal=10000;a.edesg="se";
		employee b=new employee();
		b.eid=2;
		b.ename="srija";b.esal=20000;b.edesg="java";
		employee c=new employee();
		c.eid=3;
		c.ename="sri";c.esal=30000;c.edesg="sdev";
		employee d=new employee();
		d.eid=4;
		d.ename="ranga";d.esal=50000;d.edesg="oracle";
		employee[] emp= {a,b,c,d};
		e.addemp(emp);


	}

}
