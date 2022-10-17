package javasessions;

public class AssignmentMethods {
	
	public static void main(String[] args) {
		
		AssignmentMethods ops = new AssignmentMethods();
		//System.out.println(ops.add(30, 20));
		int sum = ops.add(100, 900);
		System.out.println("Sum of two number is "+sum);
		
		int product = ops.product(12, 12);
		System.out.println("Product of two number is "+ product);
		
		System.out.println("Area of circle is "+ops.areaOfCircle(5));
		
		System.out.println("Circumference of circle "+ops.circumferenceOfCircle(10));
		
		System.out.println("max number is "+ops.maxNum(21, 210, 100));
		
		System.out.println("min number is "+ops.minNum(31, 100, 199));
		
		ops.evenOddFunc(7);
		
		AssignmentMethods.checkEligibilityToVote(19);
		
		ops.checkPrimeNum(17);
		
		ops.displayGrades(36);
		
		System.out.println(ops.factorial(6));
		
		String vals[] = {"rohit","ankush","mark","tyler"};
		ops.searchName(vals, "mark");
	}
	
	//2. Define a method that returns the product of two numbers entered by user.
	public int product(int num3, int num4)
	{
		return (num3*num4);
	}
	
	//1.Write a program to print the sum of two numbers
		//entered by user by defining your own method
	public int add(int num1, int num2) {
		return (num1+num2);
	}
	
	//3.Write a program to print the circumference and
	//area of a circle of radius entered by user by defining your own method. 
	
	public double circumferenceOfCircle(double r) {
		//C=2*3.14*r
		double circumfernce = 2*3.14*r;
		
		return circumfernce;
		
		
	}
	
	public double areaOfCircle(double rad) {
		//A=3.14*r*r
		return (3.14*rad*rad);
	}
	
	public int maxNum(int n1, int n2, int n3) {
		int max=0;
		if(n1 > n2) {
			if(n1>n3) {
				max = n1;
			}
		}else {
			if(n2>n3) {
				max= n2;
			}else {
				max = n3;
			}
		}
		
		return max;
	}
	
	public int minNum(int n1, int n2, int n3) {
		int min=0;
		if(n1 < n2) {
			if(n1<n3) {
				min = n1;
			}
		}else {
			if(n2<n3) {
				min= n2;
			}else {
				min = n3;
			}
		}
		
		return min;
	}
	
	//5. Def﻿ine a program to find out whether a given number is even or odd.
	
	public void evenOddFunc(int a) {
		if(a%2==0) {
			System.out.println(a+" is a even number ");
		}else {
			System.out.println(a+" is a odd number ");
		}
	}
	
	//6. A person is eligible to vote if his/her age is greater than or equal to 18.
	// Define a method to find out if he/she is eligible to﻿ vote.
	
	public static void checkEligibilityToVote(int age) {
		if(age>=18) {
			System.out.println("Hey congratulations!! you're eligible to vote");
		}else {
			System.out.println("Sorry please try after some time you are not eligible to vote right now");
		}		
	}
	
	//7. Define a method to find out if number ﻿is prime or not.
	
	public void checkPrimeNum(int val) {
		boolean flag = false;
		
		if(val == 0 || val ==1) {
			flag=true;
		}
		for(int i = 2; i<val; i++) {
			if(val%i == 0) {
				flag=true;
				break;
			}
		}
		
		if(flag) {
			System.out.println(val+" is not a prime number");
		}else {
			System.out.println(val+" is a prime number");
		}
	}
	
	/**
	 * 8. Write a program which will ask the user to enter 
	 * his/her marks (out of 100). Define a method that will
	 *  display grades according to the marks entered as below:
		Marks        Grade
		91-100         AA
		81-90          AB
		71-80          BB﻿
		61-70          BC
		51-60          CD﻿
		41-50          DD﻿
		<=40          Fail
	 * 
	 */
	public void displayGrades(int marks) {
		if(marks>90 && marks <=100) {
			System.out.println("AA");
		}else if(marks>80 && marks<=90) {
			System.out.println("AB");
		}else if(marks>70 && marks<=80) {
			System.out.println("BB");
		}else if(marks>60 && marks<=70) {
			System.out.println("BC");
		}else if(marks>50 && marks<=60) {
			System.out.println("CD");
		}else if(marks>40 && marks<=50) {
			System.out.println("DD");
		}else if(marks<=40) {
			System.out.println("Fail");
		}
		
	}
	
	public int factorial(int number) {
		int fact=1;
		if(number ==0) {
			return 0;
		}
		for(int i=number;i>=1;i--) {
			fact*=i;
		}
		
		return fact;
	}
	
	//WAP program for method that can take input parameter as arrays.
	//Write a function which takes an array of strings and a search string, in this function it 
	//should print only those strings of array which have the given search string in it.
	
	
	public void searchName(String[] a, String name) {
		boolean flag1 = false;
		for(int i = 0;i<a.length;i++) {
			if(a[i].contains(name)) {
				flag1=true;
				break;
			}
		}
		if(flag1) {
			System.out.println(name+" is present in an array");
		}else {
			System.out.println(name+" is not present in an array");
		}
	}
	
	
	
}
