package ExceptionHandling;

public class ThrowsKeyword {

	public static void addToCart() {
		System.out.println("Adding to cart");
		doPayment();
		
	}
	
	public static void generateOrderId(int num) throws ArithmeticException{
		System.out.println("generateOrderId");
		int i =9/num;
		
	}
	
	public static void doPayment() {
		System.out.println("doPayment");
		
		try {
			generateOrderId(0);
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
	addToCart();
	
	System.out.println("bye");
		
	}
	
}
