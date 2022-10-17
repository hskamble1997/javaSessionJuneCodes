package javasessions;

public class AssignmentStrings {

	public static void main(String[] args) {
		String name1 = "Harshal";
		String name2 = "Harshal";
		
		if(name1.equals(name2)) {
			System.out.println("Yes both the strings are equal");
		}else {
			System.out.println("No both the strings are different");
		}

		System.out.println("------------------");
		
		String name3 = " Hello Everyone ";
		System.out.println(name3);
		String name4 = name3.trim();
		System.out.println(name4);
		
		name4.replaceAll("^[A-Za-z]","");
		
		
	}

}
