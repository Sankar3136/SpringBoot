package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController1 {
   @Value("${Name}")
   private String studentName;
   @GetMapping("/disp1")
   public String getName()
   {
	   return "Welcome "+studentName+" !";
   }

}
