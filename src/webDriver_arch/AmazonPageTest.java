package webDriver_arch;

public class AmazonPageTest {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		//chrome
		//firefox
		//safari
		
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//SafariDriver driver = new SafariDriver();
		
		String browser = "chrome";
		
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		
		case "firefox":
			driver = new ChromeDriver();
			break;
			
		case "safari":
			driver = new ChromeDriver();
			break;	
			
		default:
			System.out.println("plz pass the right browser");
			break;
		}
		
		//WebDriver driver = new ChromeDriver();// top casting
		
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.sendKeys("emailID", "naveen@gmail.com");
		driver.sendKeys("Password", "naveen@123");
		driver.click("loginBtn");
		
		driver.close();
		
		
	}

}
