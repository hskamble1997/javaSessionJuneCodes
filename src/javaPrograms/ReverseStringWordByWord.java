package javaPrograms;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = revStringWordByWord("My name is Harshal");
		System.out.println(output);
	}
	
	public static String revStringWordByWord(String s) {
		String[] wordsArr = s.split("\\s");
		String reverse = "";
		for(String s1 : wordsArr) {
			StringBuilder sb = new StringBuilder(s1);
			reverse = reverse + sb.reverse().toString()+" ";
			
		}
		
		return reverse.trim();
		
		
	}

}
