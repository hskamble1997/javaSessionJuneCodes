package javaPrograms;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "WELCOME TO JAVA WITH SELENIUM";
		System.out.println(approach2(str));

	}
	
	public static String approach1(String str) {
		String[] words = str.split("\\s");
		String reverse="";
		
		
		for(String s:words) {
			StringBuilder sb = new StringBuilder(s);
			sb.reverse();
			reverse = reverse+sb.toString()+" ";
		}
		
		return reverse;
		
	}

	public static String approach2(String str) {
		
		String words[] = str.split("\\s");
		String reverseMain = "";
		
		for(String sw:words) {
			
			String reverseWord ="";
			for(int i=sw.length()-1; i>=0; i--) {
				reverseWord = reverseWord + sw.charAt(i);
			}
			reverseMain = reverseMain+reverseWord+" ";
		}
		
		return reverseMain;
	}
	
}
