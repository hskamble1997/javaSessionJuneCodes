package javasessions;

public class Customer {

	
	String name;
	int orderId;
	char gender;
	String address;
		
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.name="Kartik";
		c1.orderId=1221;
		c1.gender='f';
		c1.address="Pune";
		
		Customer c2 = new Customer();
		c2.name="arya";
		c2.orderId=1223;
		c2.gender='f';
		c2.address="Reno";
		
		Customer c3 = new Customer();
		c3.name="nayan";
		c3.orderId=1224;
		c3.gender='m';
		c3.address="LA";
		
		Customer c4 = new Customer();
		c4.name="neha";
		c4.orderId=1225;
		c4.gender='f';
		c4.address="mumbai";
		
		System.out.println(c1.name+" "+c1.orderId+" "+c1.gender+" "+c1.address);
		
	}

}
