package com.example.type;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContinentTests {

	@Test
	public void test01() {
		Continent c = Continent.North_America;
		
		System.out.println(c.getValue());
	}
	
	@Test
	public void test02() {
		Continent c = Continent.valueOf("North_America");
		
		System.out.println(c.getValue());
	}

}
