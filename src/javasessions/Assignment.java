package javasessions;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program to print positive or nagative number:
//		int i=-7;
//		if(i>0)
//			System.out.println("it is a positive number");
//		else
//			System.out.println("it is a negative number");
//	program to print biggest among 3 numbers using if statement:
//		int i=17;
//		int j=9;
//		int k=30;
//		if(i>j)
//			if(i>k)
//				System.out.println("i is the biggest among 3 numbers");
//		if(j>i)
//			if(j>k)
//				System.out.println("j is the biggest among 3 numbers");
//		if(k>i)
//			if(k>j)
//				System.out.println("k is the biggest among 3 numbers");
//		else
//			System.out.println("enter a valid number");
		
//		if(i>j && i>k) {
//			System.out.println("i is the biggest among 3 numbers");
//		}
//		else if(j>i && j>k) {
//				System.out.println("j is the biggest among 3 numbers");
//			}
//		else if(k>i && k>j) {
//					System.out.println("k is the biggest among 3 numbers");
//		}
//		else
//		{System.out.println("print a valid number");
//		
//		}
//		Program to print 5 multiplication table:
//		for(i=0;i<=10;i++) {
//			System.out.println("5" +"*"+ i + "=" + 5*i);
//			
//		}
		
	// Program to count no of digits in a number:
		int i=2345789;
		int count = 0;
		while(i>0) {
			i=i/10;
			count= count+1;	
		}
		
		System.out.println(count);

		
		
	}

}
