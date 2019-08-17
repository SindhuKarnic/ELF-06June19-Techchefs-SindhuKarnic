package com.techchefs.emp.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookie")
public class CookieController {
	
	@GetMapping("/getCookiePage")
	public String getCookiePage() {
		return "createCookie";
	}
	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse resp, ModelMap modelMap) {
		Cookie cookie = new Cookie("name", "s");
		resp.addCookie(cookie);
		modelMap.addAttribute("msg", "cookie added");
		return "createCookie";
	}
	@GetMapping("/readCookie")
	public String readCookie(@CookieValue(name = "name") String name, ModelMap modelMap) {
		
		modelMap.addAttribute("msg", name);
		return "createCookie";
	}
}
