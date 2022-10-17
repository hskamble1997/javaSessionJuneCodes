package javasessions;

public class EmployeeType {

	String name;
	int age;
	double salary;
	
	//constructor of the class:
	//constructor .. name is the same as the class name but function name can be anything
	//const..cannot return anything but func may or may not return
	//const.. does not have any return type and it cannot be static
	//const.. will be called when you create the object, but func will be called with object ref name
	
	public void test() {
		System.out.println("test method");
	}
	
	//const.. overloading
	public EmployeeType() {//0 param
		System.out.println("Default const...");
	}
	
	public EmployeeType(int a) {//1 param
		System.out.println("1 param.. const..."+a);
	}
	
	public EmployeeType(int a, String b) {//2 param
		System.out.println("2 param.. const..."+a+b);
	}
	
	
	
	public static void main(String[] args) {
		
		EmployeeType e1 = new EmployeeType(10,"Tom");
		e1.test();
	}
	
	
	
}
