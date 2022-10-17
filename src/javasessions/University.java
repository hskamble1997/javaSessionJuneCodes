package javasessions;

import java.util.ArrayList;

public class University {

	
	
	/**
	 * 1. Design a university class template with the following features:
 variables:
name﻿
country
establishedDate
List of course provided in Array List<String>


--Design the constructor of this class with different parameters and all parameters.


--Write the get method of each variable with return keyword. 
	 * 
	 * 
	 * 
	 * 
	 * @param args
	 */
	
	
	private String name;
	private String country;
	private String establishedDate;
	private ArrayList<String> al;
	
	
	public University(String name, String country) {
		this.name = name;
		this.country = country;
	}


	public University(String name) {
		this.name = name;
	}


	public University(String name, String country, String establishedDate, ArrayList<String> al) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.al = al;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public String getCountry() {
		return country;
	}


	public String getEstablishedDate() {
		return establishedDate;
	}


	public ArrayList<String> getAl() {
		return al;
	}


}
