package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		int i = 20;
		int j = 10;
		
		if(i>=j) {
			System.out.println("i is greater than j or both are equal");
		}else {
			System.out.println("both are not equal");
		}
		
		// > < >= <= ==
		
		if(10==20) {//dead code
			System.out.println("Hey");
		}else {
			System.out.println("bye");
		}
		
		if(true) {
			System.out.println("Selenium");
		}else {
			System.out.println("Cypress");
		}
		
		boolean flag = false;
		if(flag) {
			System.out.println("Testing with selenium");
		}else {
			System.out.println("Testing with cypress");
		}
		
		int total = 35;
		if(total <= 100) {
			System.out.println("PASS");
				if(total>=90) {
					System.out.println("A Grade");
						if(total >= 95) {
							System.out.println("100% discount..");
						}
						else {
							System.out.println("70% discount..");
						}
					
										
				}
				else {
					System.out.println("B Grade");
				}
		}else {
			System.out.println("Invalid marks");
		}
		
		//take a browser value ..ch/ff/i.e/safari
		//if the condition is matched ... launced the browser
		//else print a message please pass the right browser
		
		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.out.println("Launch the chrome..");
		}
		
		if(browser.equals("firefox")) {
			System.out.println("Launch the firefox");
		}
		
		if(browser.equals("ie")) {
			System.out.println("Launch the ie");
		}
		
		if(browser.equals("safari")) {
			System.out.println("launch the safari");
		}
		else {
			System.out.println("Please pass the right browser "+ browser);
		}
		
		
		//if else if
		//take a browser value..ch/ff/ie/safari...
		//if the condition is matched..launch the browser
		//else print a mesg: please pass the right browser
		
		
		String browserName = "ie";
		
		if(browserName.equals("chrome")) {
			System.out.println("launch the chrome");
		}
		else if(browserName.equals("firfox")) {
			System.out.println("Launch the firefox..");
		}
		else if(browserName.equals("safari")) {
			System.out.println("Launch the safari..");
		}
		else if(browserName.equals("ie")) {
			System.out.println("Launch the ie");
		}
		else {
			System.out.println("Please pass the right browser.."+browserName);
		}
		
		
		
		
		
		

	}

}
