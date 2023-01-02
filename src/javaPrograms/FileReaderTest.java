package javaPrograms;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderTest {

	public static void main(String[] args) throws IOException{

		//approach1();
		//approach2();
		approach3();
	}
	
	public static void approach1() throws IOException
	{
		FileReader fr = new FileReader("E:\\local.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();
	}

	public static void approach2() throws FileNotFoundException {
		
		File fs = new File("E:\\local.txt");
		Scanner sc = new Scanner(fs);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}

	public static void approach3() throws FileNotFoundException {
		File fc = new File("E:\\local.txt");
		Scanner sc = new Scanner(fc);
		
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
	}
}
