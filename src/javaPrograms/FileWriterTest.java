package javaPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("E:\\local.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Help selnium");
		bw.write("\\t");
		bw.write("Help java");
		bw.write("Help python");
		System.out.println("Finished!!!");
		bw.close();
	}

}
