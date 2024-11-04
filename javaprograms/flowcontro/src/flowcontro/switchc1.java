package flowcontro;

public class switchc1 {

	public static void main(String[] args) {
		String food="non veg";
		String forder="mandi biryani";
		switch(food)
		{
		case "veg":
		
			System.out.println("welcome to veg world");
			switch(forder)
			{
			case "dal rice":
				System.out.println(" your order is dal rice");
				break;
			case "curd rice":
				System.out.println("your order is curd rice");
				break;
			case "lemon rice":
				System.out.println("your order is lemon rice");
				break;
			default:
					System.out.println("your order is not found in veg");
			}
			break;
		case "non veg":
		
			System.out.println("welcome to non veg world");
			switch(forder)
			{
			case "chicken65":
				System.out.println(" your order is chicken65");
				break;
			case "mutton biryani":
				System.out.println("your order is mutton biryani");
				break;
			case "mandi biryan":
				System.out.println("your order is mandi biryani");
				break;
			default:
					System.out.println("your order is not found in non veg");
			}
			break;
		default:
				System.out.println("no order found");
		}
			
		}

	}


