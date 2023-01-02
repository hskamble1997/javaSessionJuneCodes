package javaPrograms;

import java.util.Random;

public class RandomNumberString {

	public static void main(String[] args) {
		
		//approach1
		Random rand = new Random();
		
		int num = rand.nextInt(100);
		System.out.println(num);
		
		//approach2
		System.out.println(Math.random());
		System.out.println(getRandomString());
		
	}
	
	public static String getRandomString() {
		
		Random re = new Random();
		String s1 = "atest"+re.nextInt(10000)+"@gmail.com";
		return s1;
	}

}
