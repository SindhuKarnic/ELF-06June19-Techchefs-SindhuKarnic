package com.techchefs.emp.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techchefs.emp.common.EMPC;
import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dao.EmployeeResponse;
import com.techchefs.emp.dto.EmployeeInfoBean;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;
	
	/*
	 * @GetMapping("/loginPage") public String getForm() { return
	 * EMPC.VIEW_LOGIN_PAGE; }
	 */
	@PostMapping(path= "/authenticate", produces = MediaType.APPLICATION_JSON_VALUE) 
	public EmployeeResponse submit(int id, String password, HttpServletRequest req) { 
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		EmployeeResponse response = new EmployeeResponse();
		if(bean != null && bean.getPassword().equals(password)) {
			//HttpSession session = req.getSession(true);
			//session.setAttribute("bean", bean);
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
	/*
	 * @GetMapping("/logout") public String logout(ModelMap modelMap, HttpSession
	 * session, @Value("${loggedOut}") String msg) { session.invalidate();
	 * modelMap.addAttribute("logoutMsg", msg); return EMPC.VIEW_LOGIN_PAGE; }
	 */
}
