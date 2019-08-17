package com.techchefs.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techchefs.emp.dto.UserBean;

@Controller
@RequestMapping("/session")
public class SessionController {
	
	@GetMapping("/loginForm")
	public String login() {
		return "myForm";
	}
	
	@PostMapping("/login")
	public String authenticate(UserBean bean) {
		if(bean.getUserid())
		return "myForm";
	}

}
