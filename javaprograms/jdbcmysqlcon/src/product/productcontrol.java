package product;

import advance.employee;

public class productcontrol {
	private productdao dao=new productdao();
	public void save(productpojo pd)
	{
		System.out.println("iamin product controller class"+pd);
		dao.save(pd);
	}
	public void update(double pcost ,String pvendor,int pid)
	{
		dao.update(pcost,pvendor,pid);
	}
	public void delete(int pid)
	{
		dao.delete(pid);
	}
	public void getbyid(int pid)
	{
		dao.getbyid(pid);
	}
	public void getall()
	{
		dao.getall();
	}

	public static void main(String[] args) {
		

	}

}
