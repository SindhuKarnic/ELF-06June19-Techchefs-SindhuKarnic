package com.tc.springboot.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tc.springboot.dto.EmployeeInfoBean;
import com.tc.springboot.dto.EmployeeResponse;
import com.tc.springboot.repository.EmployeeRepository;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	EmployeeRepository repository;
	
	@PostMapping(path= "/authenticate", produces = MediaType.APPLICATION_JSON_VALUE) 
	public EmployeeResponse submit(int id, String password, HttpServletRequest req) { 
		EmployeeInfoBean bean = repository.findById(id).get();
		EmployeeResponse response = new EmployeeResponse();
		if(bean != null && bean.getPassword().equals(password)) {
			response.setMessage("Success");
			response.setStatusCode(201);
			response.setDecription("Logged in successfully");
			response.setBeans(Arrays.asList(bean));
			req.getSession().setAttribute("bean", bean);
			return response; 
		} else {
			response.setMessage("Failure");
			response.setStatusCode(401);
			response.setDecription("Loggin failed");
			return response;
		}
	}
	@GetMapping("/logoutSubmit")
	public EmployeeResponse logout(HttpSession session) {
		session.invalidate();
		EmployeeResponse response = new EmployeeResponse();
		response.setMessage("Success");
		response.setStatusCode(201);
		response.setDecription("Logged out successfully");
		return response; 
	}
	@GetMapping("/readCookie")
	public EmployeeResponse readCookie(@CookieValue(name="JSESSIONID") String sessionId) {
		EmployeeResponse response = new EmployeeResponse();
		response.setMessage("Success");
		response.setStatusCode(201);
		response.setDecription("jsession"+sessionId);
		return response;
		
	}
}
