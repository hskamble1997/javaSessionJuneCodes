package javasessions;

public class AssignmentStringManipulation {

	//1.  Write a program to check two different strings equality.
	
	public static void checkStringEquality() {
		
		String s1 = "Harshal";
		String s2 = "harshal";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
	}
	
	//2. Remove all  spaces in a String
	//For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.
	
	public static void removeSpaces(String s) {
		System.out.println(s.replaceAll("\\s+", ""));
	}
	
	
	/**
	 * 3. Write a program that will  print out the last character and first character of a word.
	 * @param args
	 */
	
	public static void lastAndFirstChar(String s) {
		
		for(int i=0; i<s.length();i++) {
			if(i==0 || i == s.length()-1) {
				System.out.println(s.charAt(i));
			}
			
		}
		
		
	}
	
	/**
	 * Write a program to verify a word or a character contained in the sentence.
	 * @param args
	 */
	
	public static void checkWordOrChar(String s) {
		
		for(int i=0; i<s.length();i++) {
			if(s.contains("Max")) {
				System.out.println("True");
				break;
			}else {
				System.out.println("False");
				break;
			}
			
		}
		
		
	}
	
	/**
	 * .Write a function/ method to reverse your own name.
	 * @param args
	 */
	
	public static void reverseName(String s) {
		String[] a1 = s.split(" ");
		for(int i =a1.length-1; i>=0; i--) {
			System.out.print(a1[i]+" ");
			
		}
		
		System.out.println();
		
//		for(int i = s.length()-1 ; i>=0; i--) {
//			System.out.print(s.charAt(i));
//		}
	}
	
	//WAP to get third 'e' of a string
	public static void thirdOccurenceOfString(String s) {
		
		
		//System.out.println(s.charAt(s.indexOf('e', s.indexOf('e', s.indexOf('e')+1)+1))+" : " + s.indexOf('e', s.indexOf('e', s.indexOf('e')+1)+1));
		
		char[] ch = s.toCharArray();
		int count = 0;
		
		for(int i = 0; i<ch.length; i++) {
			if(ch[i] == 'e') {
				count = count+1;
				if(count == 3) {
					System.out.println("The third occurence of "+ch[i]+" is "+ i);
				}
			}
		}
	}
	
	//6. Write a program that gives you the last half of the string.
	public static void lastHalf(String s) {
		
		System.out.println(s.substring(s.length()/2));
	}
	
	//8. Write a method which gives an index of (-1) if string is not available. .
	//it should return integer. if String is present, then it should return the specific index.
	
	public static int stringPresent(String s, String search) {
		
		if(s.indexOf(search) >= 0) {
			return s.indexOf(search);
		}else {
			return -1;
		}
		
	}
	
	//9. Write a program that breaks a whole string into small strings, and prints out its all values . (Hint: split, loop) .
	public static void breakStrings(String s) {
		String[] str1 = s.split(",");
		for(int i=0; i<str1.length; i++) {
			System.out.print(str1[i]+ " ");
		}
		System.out.println();
	}
	
	//10. Assume that a string consists of 3 words, print out the middle one. 
	public static void middleString(String s) {
		String[] str1 = s.split(" ");
		for(int i=0; i<str1.length; i++) {
			if(i == 1) {
				System.out.println(str1[i]);
			}
			
		}
	}
	
	//11. get only numeric part from this String:
	//String s = "your transaction id is: 12345 and reference id is 34567";
	
	public static void getNumeric(String s) {
		System.out.println(s.replaceAll("[^0-9]", ""));
	}
	
	public static void main(String[] args) {
	
		checkStringEquality();
		String s3 = "    Hello    Everyone    ";
		removeSpaces(s3);
		String s4 = "Harshal";
		lastAndFirstChar(s4);
		String s5 = "Min and Max";
		checkWordOrChar(s5);
		reverseName("Harshal Siddharth Kamble");
		thirdOccurenceOfString("we love America");
		lastHalf("Markus");
		
		int resp = stringPresent("aerial calibri gotham","calibri");
		System.out.println(resp);
		
		breakStrings("aman,nits,amol,hruta");
		middleString("First Middle Last");
		
		getNumeric("your transaction id is: 12345 and reference id is 34567");
	}

}
