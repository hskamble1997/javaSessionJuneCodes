package javasessions;

import java.util.ArrayList;

public class Browserconstr {

	/**
	 * 
	 * 2. Design a browser class template with the following features:
 variables:
browserName﻿
vendorName
currentVersion
List of plugins supported by Browser in Array List<String>


--Design the constructor of this class with different parameters and all parameters.


--Write the get method of each variable with return keyword.
	 * @param args
	 */
	
	String browserName;
	String vendorName;
	double currentVersion;
	ArrayList<String> plugins;
	
	
	public Browserconstr(String browserName, ArrayList<String> plugins) {
		this.browserName = browserName;
		this.plugins = plugins;
	}


	public String getBrowserName() {
		return browserName;
	}


	public String getVendorName() {
		return vendorName;
	}


	public double getCurrentVersion() {
		return currentVersion;
	}


	public ArrayList<String> getPlugins() {
		return plugins;
	}


	public Browserconstr(String browserName, String vendorName, double currentVersion, ArrayList<String> plugins) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.plugins = plugins;
	}


	public static void main(String[] args) {
		ArrayList al1 = new ArrayList<String>();
		al1.add("FUllPage");
		al1.add("selectorshub");
		
		Browserconstr br = new Browserconstr("FIrefox","DSK",100.09,al1);
		ArrayList<String> al2 = br.getPlugins();
		for(int i =0; i<br.getPlugins().size();i++) {
			System.out.println(al2.get(i));
		}
		

	}

}
