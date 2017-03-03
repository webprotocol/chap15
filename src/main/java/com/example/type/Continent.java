package com.example.type;

public enum Continent {
	
	Asia("Asia"), 
	Europe("Europe"), 
	North_America("North America"), 
	Africa("Africa"), 
	Oceania("Oceania"), 
	Antarctica("Antarctica"), 
	South_America("South_America");
	
	private String value;
	Continent(String v) {
		value = v;
	}
	
	public String getValue() {
		return this.value;
	}
	

}
