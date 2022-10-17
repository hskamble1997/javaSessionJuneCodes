package oop_encapsulation;

public class EmpTest {

	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	private char gender;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public void getEmpInfo() {

		System.out.println("Name is : "+ name);
		System.out.println("Age is : "+ age);
		System.out.println("Salary is : "+ salary);
		System.out.println("Is Active :"+ isActive);
		System.out.println("Gender is :"+gender);
	}

	public static void main(String[] args) {
		EmpTest e1 = new EmpTest();
		e1.setActive(false);
		e1.setAge(99);
		e1.setGender('f');
		e1.setName("Admin");
		e1.setSalary(9.8);
		
		e1.getEmpInfo();
	}

}
