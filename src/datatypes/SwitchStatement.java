package datatypes;

public class SwitchStatement {

	public static void main(String[] args) {
//		String name = " Divya";
//		if (name.trim().equals("Divya")) {
//			System.out.println("100 marks");
//		} else if (name.equals("Vidya")) {
//			System.out.println("70 marks");
//		} else if (name.equals("Nitya")) {
//			System.out.println("10 marks");
//		} else if (name.equals("Sishya")) {
//			System.out.println("80 marks");
//		} else {
//			System.out.println(name + " " + "student is not found...");
//		}
		
//		String name = "Vidya";
//		switch(name.toLowerCase().replace(" ", "")) {
//		case "ramya":
//			System.out.println("100 marks");
//			break;
//		case "vidya":
//			System.out.println("40 marks");	
//			break;	
//		case "nithya":
//			System.out.println("50 marks");
//			break;
//		case "meera":
//			System.out.println("70 marks");
//		default:
//			System.out.println(name + " student not found");
//		}
		
//		String environment = "dev";
//		switch(environment.toLowerCase().replace(" ", "")) {
//		case "dev":
//			System.out.println("test in dev environment");
//			break;
//		case "qa":
//			System.out.println("test in qa environment");
//			break;
//		case "uat":
//			System.out.println("test in uat environment");
//			break;
//		case "stage":
//			System.out.println("test in stage environment");
//			break;
//		case "pqa":
//			System.out.println("test in pqa environment");
//			break;
//		case "production":
//			System.out.println("test in production environment");
//			break;
//		default:
//			System.out.println("Enter correct environment type");
//		
//		}
//	    
String environment="dev";
//	    if(environment.equals("dev")){
//	    	System.out.println("testing in dev environment");
//	    }
//	    else if(environment.equals("qa")){
//	    	System.out.println("testing in qa environment");
//	    }
//	    else if(environment.equals("uat")){
//	    	System.out.println("testing in uat environment");
//	    }
//	    else if(environment.equals("stage")){
//	    	System.out.println("testing in stage environment");
//	    }
//	    else if(environment.equals("production")){
//	    	System.out.println("testing in production environment");
//	    }
//	    else {
//	    	System.out.println(environment + " not found");	    }
	    
//to know the no of corona cases in each state in India:
			String state= "delhi";
					
			int coronacases= 0;
			switch (state.toLowerCase().replace(" ","")){
			case "telangana":
				coronacases=20000;
				System.out.println("no of corona cases in telangana"+"="+coronacases);
				break;
			case "delhi":
				coronacases=30000;
				System.out.println("no of corona cases in delhi"+"="+coronacases);
				break;
			case "kerala":
				coronacases=15000;
				System.out.println("no of corona cases in kerala"+"="+coronacases);
				break;
			case "orissa":
				coronacases=10000;
				System.out.println("no of corona cases in orissa"+"="+coronacases);
				break;

			default:
				System.out.println("enter valid state name");
				break;
			}

		
	}

}
