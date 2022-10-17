package webDriver_arch;

public class FireFoxDriver implements WebDriver{
	public FireFoxDriver() {
		System.out.println("launch FireFox browser");
	}
	
	@Override
	public void get(String url) {
		System.out.println("launch url: "+ url);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "amazon";
	}

	@Override
	public void click(String element) {
		System.out.println("click on:"+element);
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering to element:"+ value);
		
	}

	@Override
	public void close() {
		System.out.println("close the browser");		
	}
}
