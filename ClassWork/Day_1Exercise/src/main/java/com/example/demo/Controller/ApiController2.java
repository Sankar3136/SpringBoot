package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController2 {
	@Value("${color}")
    private String favcolor;
	@GetMapping("/disp2")
	public String getMyfav()
	{
		return "My favorite color is "+favcolor;
	}
	



}
