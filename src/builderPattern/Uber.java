package builderPattern;

public class Uber {
	public Uber login() {
		System.out.println(" default login");
		return this;
	}
	public Uber login(String un,String pwd) {
		System.out.println(" loging in with "+un+":"+pwd);
		return this;
	}
	public Uber startLocation(String cityname) {
		System.out.println(" enter start location");
		return this;
	}
	public Uber endLocation (String cityname) {
		System.out.println("enter end location");
		return this;
	}
	public Uber doSearch() {
		System.out.println(" default search");
		return this;
	}
	public Uber doSearch(String carType) {
		System.out.println(" searching for "+ carType);
		return this;
	}
	public Uber orderID(int number) {
		System.out.println(" order ID is :"+ number);
		return this;
	}
	public Uber logout() {
		System.out.println(" default logout");
		return this;
	}

}
