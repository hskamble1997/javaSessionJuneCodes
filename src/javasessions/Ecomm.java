package javasessions;

public class Ecomm {

	//0 param
	public void test()
	{
		System.out.println("Test method");
	}

	//1 Param
	public int test(int i) {
		return 10+i;
	}
	
	//1 Param
	public String test(String k) {
		return "naveen";
	}
	
	//2 params
	public int test(int p, String k) {
		return p+10;
	}
	
	//2 params
	public void test(String b, int a) {
		
	}
	
	public void pop() {
		
	}
	
	//feature--business-PO-->method
	public void login() {
		
	}
	
	public void login(String username,String Password) {
		
	}
	
	public void login(String username,String password, int otp) {
		
	}
	
	public void login(String username, String password,String role) {
		
	}
	
	public void search() {
		
	}
	
	public void search(String productName) {
		
	}
	
	public void search(String productName, String color) {
		
	}
	
	public void search(String productName, String color, int price) {
		
	}
	
	//
	public void doPayment(String upi) {
		
	}
	
	public void doPayment(String CC, int cvv, int otp) {
		
	}
	
	public void doPayment(String paypalId, String pwd) {
		
	}
	
	//uber:
	public void booking(String stLocation, String endLocation) {
		
	}
	
	public void booking(String stLocation, String endLocation, String CarType) {
		
	}
	
	public void booking(String stLocation, String endLocation, String CarType, String couponCode) {
		
	}
		
	public static void main(String[] args) {
		//Method Overlaoding: (static) compile time Poly(many) + morphism(forms)
		//Within the same class, when you have methods with
		//1. the same name
		//2. different number of parameters
		//3. the different sequence of the parameters
		
		Ecomm obj = new Ecomm();
		obj.test();
		int sum = obj.test(20);
		System.out.println(sum);

		obj.booking("whitefield", "JP nagar", "sedan", "naveen10");
						
	}

}
