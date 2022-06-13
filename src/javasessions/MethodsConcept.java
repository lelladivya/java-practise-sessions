package javasessions;

public class MethodsConcept {
	
	int a=100;
	int b=200;
	int c=300;
	
	void emptyMethod() {
		System.out.println("this is Divya");
	}
	int add() {
		System.out.println(a+b);
		return(a+b);
	}
	int sum(int p,int q) {
		System.out.println("this is sum method");
		return (p+q);
		
	}
	boolean getBrowser(String browserName) {
		System.out.println("Browser name is:"+ browserName);
		boolean flag=true;
		switch (browserName.toLowerCase()) {
		case "chrome":
			System.out.println("launch the browser:"+ browserName);
			
			break;
		case "firefox":
			System.out.println("launch the browser:"+ browserName);
			break;
		case "opera":
			System.out.println("launch the browser:"+ browserName);
			break;

		default:
			System.out.println("enter the valid browser name:"+browserName);
			flag=false;
			break;
		}
		return flag;
	}
		

	public static void main(String[] args) {
		MethodsConcept x=new MethodsConcept();
//		x.emptyMethod();
//		System.out.println(x.a);
//		x.add();
//		int i=x.sum(70, 40);
//		System.out.println(i);
//		if( i>100 ) {
//			System.out.println("i is greater than 100");
//		}
//		else {
//			System.out.println("i is not greater than 100");
//			
//		}
		boolean i=x.getBrowser("ie");
		System.out.println(i);
		if( i) {
			System.out.println("thank you for entering the corret browser name");
		}
		else {
			System.out.println("this is not the correct browser");
		}
		//i=x.getBrowser("safari");
		
		}
			
			
	}


