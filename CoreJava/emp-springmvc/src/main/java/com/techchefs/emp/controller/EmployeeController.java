package com.techchefs.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/abc")
public class EmployeeController {
	
	@RequestMapping(path="/getMessage", method=RequestMethod.GET)
	public ModelAndView getMessage() {
		ModelAndView mnv = new ModelAndView();
		//mnv.setViewName("../WEB-INF/views/messagePage.jsp");
		mnv.setViewName("messagePage");
		return mnv;
	}
	
	@GetMapping("/seeMsg")
	public ModelAndView seeMessage(ModelAndView mnv) {
		//mnv.setViewName("../WEB-INF/views/messagePage.jsp");
		mnv.setViewName("messagePage");
		return mnv;
	}

}
