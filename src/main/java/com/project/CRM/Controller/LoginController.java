package com.project.CRM.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.CRM.DTO.UserDTO;
import com.project.CRM.Service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@PostMapping(value = "/loginUser")
	public String loginUser(String name,String password) {
		if(loginService.login(name, password)) {
			return "dashboard";
		}
		return "login";
	}
	
	@GetMapping("/dashboard")
	public String getDashBoard() {
		return "dashboard";
	}
	
	@RequestMapping(value = "/signup" , method = RequestMethod.GET)
	public String signupPage() {
		return "signup";
	}
	
	@PostMapping("/registerUser")
	public String registerUser(UserDTO user) {
		if(user != null) {
			String message = loginService.registerUser(user);
		}
		return "signup";
	}
	
	
}
