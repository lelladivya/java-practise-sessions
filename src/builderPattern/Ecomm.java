package builderPattern;

public class Ecomm {
	public Ecomm login() {
		System.out.println("default login");
		return this;
	}
	public Ecomm login(String un,String pwd) {
		System.out.println("login with"+un+":"+pwd);
		return this;
	}
	public Ecomm doSearch(String name) {
		System.out.println("searching"+name);
		return this;
	}
	public Ecomm doSearch(String name,int price) {
		System.out.println("searching"+name);
		return this;
	}
	public Ecomm addToCart(String name) {
		System.out.println("add to cart"+name);
		return this;
	}
	public Ecomm doPayment(String upi) {
		System.out.println("upi number"+upi);
		return this;
	}
	public Ecomm doPayment(String upi,int otp) {
		System.out.println("upi number"+upi+":"+otp);
		return this;
	}
	public Ecomm orderID() {
		System.out.println("order id is :"+12345);
		return this;
	}
	public Ecomm logout() {
		System.out.println("logout from the app");
		return this;
	}
}
