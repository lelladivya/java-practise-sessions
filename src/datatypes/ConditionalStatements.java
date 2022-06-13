package datatypes;

public class ConditionalStatements {

	public static void main(String[] args) {
	
//		int a = 5;
//		int b = 10;
//		if(a>b) {
//			System.out.println("a is greater than b");
//		}
//		else{
//			System.out.println("b is greater than a");
//		}
//		int marks = 65;
//		if (marks > 90)
//			System.out.println("A grade");
//		else if (marks > 80)
//			System.out.println("B grade");
//		else if (marks > 60)
//			System.out.println("C grade");
//		else if (marks > 40)
//			System.out.println("D grade");
//		else
//			System.out.println("fail");
		int marks = 70;
		if (marks > 40){
			if(marks>50){
				System.out.println("D Grade");
			}
				 if(marks>60){
					  System.out.println("C Grade");
					  }
				      if(marks>70){
						   System.out.println("B Grade");
					   }
				          if(marks>80){
							   System.out.println("A Grade");
						    }
				  else {
					System.out.println("fail");  
				}
		}
	}

}
