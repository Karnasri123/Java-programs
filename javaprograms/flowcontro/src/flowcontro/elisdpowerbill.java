package flowcontro;

public class elisdpowerbill {

	public static void main(String[] args) {
		int units=522;
		int price;
		
			if(units<=100)
			{
				price=4;
				System.out.println("power bill=="+(units*price));
			}
			else if(units>=101&&units<=200)
			{
				price=8;
				System.out.println("power bill=="+((units-100)*price+400));
			}
			else if(units>=201&&units<=300)
			{
				price=15;
				System.out.println("power bill=="+((units-200)*price+1200));
			}
			else if(units>=301&&units<=500)
			{
				price=20;
				System.out.println("power bill=="+((units-300)*price+(400+800+1500)));
			}
			else
			{
				price=25;
				System.out.println("power bill=="+((units-500)*price+(400+800+1500+2000)));
			}
		

	}

}
