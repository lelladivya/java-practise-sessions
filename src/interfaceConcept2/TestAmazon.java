package interfaceConcept2;

public class TestAmazon {

	public static void main(String[] args) {
		String Browser="Chrome";
		WebDriver driver=null;
		if (Browser.equalsIgnoreCase("chrome") ) {
		driver=new ChromeDriver();
		}
		else if (Browser.equalsIgnoreCase("firefox") ) {
			driver=new FirefoxDriver();
			}
		else if (Browser.equalsIgnoreCase("safari") ) {
			driver=new SafariDriver();
			}
		else {
			System.out.println("please pass the right browser name :"+ Browser);
		} 
		
		driver.get("http;//www,amazon.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getTitle();
		System.out.println(url);
		
		driver.findElement("email id");
		driver.sendKeys("email id", "divya@gmail.com");
		
		driver.findElement("email pwd");
		driver.sendKeys("email pwd", "divya@123");
		
		driver.findElement("login ");
		driver.click("login");
		
		driver.quit();
		
		
	
		
	}

}
