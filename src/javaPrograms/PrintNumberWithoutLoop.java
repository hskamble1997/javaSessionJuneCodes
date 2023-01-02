package javaPrograms;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test(1,100);
		IntStream.range(1, 101).forEach(e -> System.out.println(e));
	}
	
	public static void test(int startNum, int lastNum) {
		if(startNum<=lastNum) {
			System.out.println(startNum);
			startNum++;
			test(startNum,lastNum);
		}
	}

}
