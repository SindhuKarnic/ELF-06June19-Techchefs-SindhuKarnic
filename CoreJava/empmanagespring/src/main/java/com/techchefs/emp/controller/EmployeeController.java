package com.techchefs.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techchefs.emp.EmployeeDAO;
import com.techchefs.emp.EmployeeDAOFactory;
import com.techchefs.emp.EmployeeInfoBean;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/login")
	public String getForm() {
		return "login";
	}
	
	  @PostMapping("/loginSubmit") 
	  public String submit(int eid, String password, ModelMap modelMap) { 
		  EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		  EmployeeInfoBean bean = dao.getEmployeeInfo(eid);
		  if(bean == null) {
			  modelMap.addAttribute("message", "Invalid Id");
				return "login";
		  } else if(bean.getPassword().equals(password)) {
			  modelMap.addAttribute("bean", bean);
			  return "homePage"; 
		  } else {
			  modelMap.addAttribute("message", "Invalid Credentials");
				return "login";
		  }
	  }
	 
}
