package oop_encapsulation;

public class AssignmentEncapsulation {

	/**
	 * Create Employee class:
define class vars with private : name, age, salary, isActive, Gender
create getter and setter for each class private vars
create getEmployeeInfo() method in Employee class which will return al the values of employee
	 * 
	 * 
	 * 
	 * 
	 * @param args
	 */
	
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

}
