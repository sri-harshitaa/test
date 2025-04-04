package com.example.PaymentsWebApp.Controller;

	 import org.springframework.stereotype.Controller;
	 import org.springframework.web.bind.annotation.RequestMapping;

	 @Controller
	 public class TestController {

	     @RequestMapping("/test")
	     public String home(){
	     	System.out.println("Hello");
	         return "test";
	     }
	 }

