package DataConversion;

import java.util.Arrays;

public class DataConversion {

	public static void main(String[] args) {
		
		// 1. String to int
		String x = "200";
		System.out.println(x + 20);

		//wrapper classes:
		//int --> Integer
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
//		String y = "100A";
//		System.out.println(y+20);
//		int j = Integer.parseInt(y);
//		System.out.println(j);
		
		//2.String  to double:
		String t = "12.33";
		System.out.println(t+20);
		
		//double --> Double
		double t1 = Double.parseDouble(t);
		System.out.println(t1+20);
		
		
		//int to String:
		int pop = 100;
		System.out.println(pop + 20);
		
		int totalBill = pop + 50 -10;
		System.out.println(totalBill);
		
		String amount = String.valueOf(totalBill);
		System.out.println(amount +10);
		
		//double to String:
		double avg = 12.33;
		String newAvg = String.valueOf(avg);
		System.out.println(newAvg + 1000);
		
		//String to boolean:
		String headless = "false";
		boolean flag = Boolean.parseBoolean(headless);
		
		if(Boolean.parseBoolean(headless)) {
			System.out.println("Run in headless mode");
		}else {
			System.out.println("Run in normal mode");
		}
		
		//boolean to String
		boolean test = true;
		String p = String.valueOf(test);
		System.out.println(p+20);
		
		//char to string
		char ch = 'a';
		String val = String.valueOf(ch);
		System.out.println(val);
		
		//String to char
		
		String ne = "A";
		
		char ce = ne.charAt(0);
		System.out.println(ce);
		
		//split:
		String top = "java_python_ruby_dotnet";
		
		String arr[] = top.split("_");
		System.out.println(arr[0]);
		//System.out.println(arr[4]);//AIOB
		
		String foo = "xXtestingXxXseleniumxXXautomationXxXjava";
		String f[] = foo.split("xX");
		
		System.out.println(f[0]);
		
		System.out.println(f[1]);
		
		
		System.out.println(f[2]);
		
		System.out.println(f[3]);
		
		System.out.println(f[4]);
		
		String lol = "HelloJavaAutomationJavaTesting";
		String l[] = lol.split("Java");
		System.out.println(Arrays.toString(l));
		
		String empData = "Aarthi;sundar;aarthi@gmail.com;aarthi123;jan201990";
		String data[] = empData.split(";");
		for(String e : data)
		{
			System.out.println(e);
		}
		
		String lg = "hello selenium java";
		String lk[] = lg.split("\\s+");
		System.out.println(Arrays.toString(lk));
		
		char c[] = {'t','e','s','t'};
		String sc = new String(c);
		System.out.println(sc);
		System.out.println(String.valueOf(c));
		
		
	}

}
