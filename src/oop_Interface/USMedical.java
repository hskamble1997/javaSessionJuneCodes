package oop_Interface;

public interface USMedical extends WHO {

	// abstract method : having no method body
	// can not create the object of Interface

	public void pediaServices();

	public void physioServices();

	public void OrthoServices();

	public void emergencyServices();

	public void dentalServices();

	public void dentalServices(int dentists);

	public int dentalServices(int dentists, String dentalMachine);

	// after JDK 1.8

}
