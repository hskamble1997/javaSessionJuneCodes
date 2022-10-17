package javasessions;

import java.util.ArrayList;

public class AssignmentMethodOverloading {

	/**
	 * Method Overloading: Consider a food delivery system and try to overload
	 * following feaures:
	 * 
	 * 
	 * feature1 : Login with : all the methods will return boolean (true/false)
	 * phone, password phone, otp username, password username, password, otp
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		AssignmentMethodOverloading obj = new AssignmentMethodOverloading();
		obj.loginWith("foodpanda", 'a');
		
		obj.loginWith("0987654321", 12345);
		
		obj.loginWith("1234567890", "abcd");
		
		obj.loginWith("ubereats", "abcd", 12345);
		
		System.out.println("By resto name "+obj.searchResto("leela"));
		
		System.out.println("By name and food item "+obj.searchResto("oberoi", "tea"));
		
		System.out.println("By name, food item and price "+obj.searchResto("Taj", "snacks", "350"));
		
		System.out.println("By name, food item and price and rating "+ obj.searchResto("novotel", "sandwich", "450", "4 star"));
	}
	
	public boolean loginWith(String phone, String password) {
		if(phone.length()==10 && password.equalsIgnoreCase("abcd")) {
			System.out.println("Welcome to swiggy");
		}
		return true; 
	}
	
	public boolean loginWith(String phone, int otp) {
		if(phone.length()==10 && otp==12345) {
			System.out.println("Welcome to zomato");
		}
		return true; 
	}
	
	public boolean loginWith(String username, char password) {
		if(username.equalsIgnoreCase("foodpanda") && password=='a') {
			System.out.println("Welcome to foodpanda");
		}
		return true; 
	}
	
	public boolean loginWith(String username, String password, int otp) {
		if(username.equalsIgnoreCase("ubereats") && password.equals("abcd") && otp == 12345) {
			System.out.println("Welcome to ubereats");
		}
		return true; 
	}
	
	
	public int searchResto(String restaurantName) {
		
		return 100;
	}
	
	public ArrayList<String> searchResto(String restaurantName, String foodItem) {
		ArrayList<String> al = new ArrayList<String>();
		al.add(restaurantName);
		al.add(foodItem);
		
		return al;
		
	}
	
	public ArrayList<String> searchResto(String restaurantName, String foodItem, String price) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add(restaurantName);
		al1.add(foodItem);
		al1.add(price);
		return al1;
		
	}
	
	public ArrayList<String> searchResto(String restaurantName, String foodItem, String price, String rating) {
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add(restaurantName);
		al2.add(foodItem);
		al2.add(price);
		al2.add(rating);
		return al2;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
