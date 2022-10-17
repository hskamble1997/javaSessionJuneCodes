package oop_encapsulation;

public class Browser {

	
	public void launchBrowser() {
		System.out.println("launching browser");
		checkBrowserVersion();
		checkOSComtible();
		enoughRAMSpace();
		checkbrowserUpgrade();
		System.out.println("browser is launched");
				
	}
	
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}
	
	private void checkOSComtible() {
		System.out.println("checkOSCpmtible");
	}
	
	private void enoughRAMSpace() {
		System.out.println("enoughRAMSpace");
	}
	
	private void checkbrowserUpgrade() {
		System.out.println("checkbrowserUpgrade");
	}
	
}
