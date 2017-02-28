package com.example.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountryController {
	
	@RequestMapping("/country")
	public String xxx(BigDecimal pop) {
		System.out.println("############");
		System.out.println("pop=" + pop);
		System.out.println("############");
		
		return "xxx";
	}

}
