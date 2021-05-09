package com.quest.pnext.authservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyTestController {

	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "Hello user";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "Hello Admin";
	}
}
