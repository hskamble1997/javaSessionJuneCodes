package javasessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		//take a browser value...ch/ff/ie/safari....
		//if the condition is matched...launch the browser
		//else print a mesg: please pass the right browser

		String browser = "safari";
		
		switch (browser) {
		case "chrome":
			System.out.println("Launch chrome");
			break;
			
		case "firefox":
			System.out.println("Launch firefox");
			break;
			
		case "safari":
			System.out.println("Launch safari");
			break;
			
		default:
			System.out.println("Please pass the right browser "+browser);
			break;
		}		
		
//		boolean flag = true;
//		double marks = 12.33;
//		switch (marks) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		
		//switch case : byte, short, int, long, double, float, char, String
		
		
		//multiple environment: QA/DEV/UAT/STAGE/PROD
		//cross browser logic
		//locator: 
		
		int total = 100;
		
//		switch (total) {
//		case 80:
//			System.out.println("grade a");
//			break;
//		case 80:
//			System.out.println("grade a");
//			break;
//
//		default:
//			break;
//		}
		
		
		int t = -100;
		int u = t+++20;
		System.out.println(t);
		System.out.println(u);
		
		
	}

}
