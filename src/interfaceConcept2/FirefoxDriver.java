package interfaceConcept2;

public class FirefoxDriver implements SearchContext, WebDriver {
	
	public FirefoxDriver() {
		System.out.println("launch firefox browser");
	}
	
	
	@Override
	public void findElement(String element) {
		System.out.println("find element :"+ element);
		
	}

	@Override
	public void findElements(String element) {
		System.out.println("find elements :" + element);
		
		
	}
	@Override
	public void get(String url) {
		System.out.println("enter url :"+ url);
		
		
	}

	@Override
	public String getTitle() {
		
		return "Amazon";
	}

	@Override
	public String getUrl() {
		
		return "http://www.amazon.com";
	}

	@Override
	public void click(String element) {
		System.out.println("click on element :"+ element);
		
		
	}

	@Override
	public void sendKeys(String element, String values) {
		System.out.println("enter value in element :"+ element+"value is:"+ values);
	
	}

	@Override
	public void quit() {
		System.out.println("quit browser");
		
		
	}


	

}
