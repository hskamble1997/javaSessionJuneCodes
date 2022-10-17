package BuilderPattern;

public class ShoppingTest {

	public static void main(String[] args) {
		
		Ecomm u1 = new Ecomm();//1 object
		u1.doLogin("ak12@gmail.com", "ak123")
			.search("MACBOOK")
				.addtoCart("macbook pro")
					.makePayment("341134113411347", 1234)
						.generateOrder()
							.logout();
		
		u1.doLogin("ak12@gmail.com", "ak123")
			.addtoCart("iMac")
				.makePayment("341134134", 314)
					.generateOrder()
						.logout();
		
		
		u1.doLogin("dev@gmail.com", "123dev")
			.search("ipad")
				.logout();
		
		u1.doLogin("ak12@gmail.com", "ak123")
			.logout();
		
		u1.doLogin("adsd@gmail.com", "asffasf");
		
		u1.doLogin()
			.search("macbook")
				.addtoCart("macbook pro")
					.makePayment("12421412412", 124)
						.generateOrder()
							.logout();
		

	}

}
