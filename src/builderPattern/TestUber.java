package builderPattern;

public class TestUber {

	public static void main(String[] args) {
		Uber u=new Uber();
		u.login("lelladivya@gmail.com", "123456")
			.startLocation("Bowenpally")
				.endLocation("madapur")
					.logout();
		System.out.println("--------------");
		u.login("lelladivya@gmail.com", "123456")
			.endLocation("kphb")
				.doSearch("elantra")
					.logout();
		System.out.println("--------------");
		u.login("lelladivya@gmail.com", "123456")
			.doSearch()
				.endLocation("secunderabad")
					.doSearch()
						.orderID(9876);
				
		

	}

}
