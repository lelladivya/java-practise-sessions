package methodChaining;
/* we can call non static method from non static method directly.
 * we can call static method from static method directly.
 * we can call static method from non static method directly.
 * To call non static method from static method we need to create an object --through object only we can call non static method from static method.
 * 
 */

public class Application {
	public void m1() {
		System.out.println("this is m1 method");
		m2();
		t1();
	}
	public void m2() {
		System.out.println("this is m2 method");
		m3();
	}
	public void m3() {
		System.out.println("this is m3 method");
	}
	public static void main(String[] args) {
		Application obj=new Application();
		obj.m1();
		//Application.t1();

	}
	public static void t1() {
		System.out.println("this is static t1 method");
		t2();
		//new Application().m1();
		
	}
	public static void t2() {
		System.out.println("this is static t2 method");
		t3();
	}
	public static void t3() {
		System.out.println("this is static t3 method");
	}


}
