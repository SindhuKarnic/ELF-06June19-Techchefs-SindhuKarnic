package com.techchefs.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/deligates")
public class RequestDispatcherController {
	@GetMapping("/getHomePage")
	public String getHomePage() {
		return "homepage";
	}
	@GetMapping("/forwardReq")
	public String forwardRequest() {
		return "forward:/forms/getForm";
	}
	@GetMapping("/redirectReq")
	public String redirectRequest() {
		return "redirect:https://www.google.com";
	}
}
