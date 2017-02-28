package com.example;

import java.math.BigDecimal;

import org.junit.Test;

public class BigDecimalTests {
	
	@Test
	public void test01() {
		BigDecimal big = new BigDecimal(1000.998);

		int x = big.intValue() * 10;
		
		System.out.println(big.floatValue());
		
	}

}
