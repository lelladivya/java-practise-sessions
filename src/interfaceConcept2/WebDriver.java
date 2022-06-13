package interfaceConcept2;

public interface WebDriver extends SearchContext{
	public void get(String url);
	
	public String getTitle ();
	
	public String getUrl();
	
	public void click(String element);
	
	public void sendKeys(String element,String values);
	
	public void quit();
}
