package com.var;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myAppController {
	
	@RequestMapping(path="/")
	public String getHomePage() {
		return "home-page";
	}
	
	@RequestMapping(path="/main")
	public String getMainPage() {
		return "main";
	}
	
	@RequestMapping(path="/showform")
	public String showForm() {
		return "myForm";
	}
	
	@RequestMapping(path="/welcomeuser")
	public String welcomeUser() {
		return "welcome-user";
	}
	
	@RequestMapping(path="/mathtable")
	public String mathTable() {
		return "math-table";
	}

}
