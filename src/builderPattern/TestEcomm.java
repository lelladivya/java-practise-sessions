package builderPattern;

public class TestEcomm {

	public static void main(String[] args) {
		Ecomm e =new Ecomm();
		e.login();
		e.login("lelladivya", "123456")
		   .addToCart("ipad")
		     .doPayment("78965");
	}		

}
