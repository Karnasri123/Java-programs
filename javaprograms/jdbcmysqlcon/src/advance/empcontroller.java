package advance;

public class empcontroller {
	//controller will take data and send to dao class
	//validation done in this class.
	private employeedao dao=new employeedao();
	public void save(employee emp)
	{
		System.out.println("iamin emp controller class"+emp);
		dao.save(emp);
	}
	public void update(String eloc,String edesg,int eid)
	{
		dao.update(eloc,edesg,eid);
	}
	public void delete(int eid)
	{
		dao.delete(eid);
	}
	public void getbyid(int eid)
	{
		dao.getbyid(eid);
	}
	public void getall()
	{
		dao.getall();
	}

	


	public static void main(String[] args) {
		
	}

}
