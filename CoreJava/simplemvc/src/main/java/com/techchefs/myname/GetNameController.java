package com.techchefs.myname;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myname")
public class GetNameController {
	@GetMapping("/nam")
	public String getPage() {
		return "myButton";
	}
	@GetMapping("/getmyname")
	public String getName(ModelMap modelMap) {
		GetName name= new GetName();
		modelMap.addAttribute("name", name.getMyName());
		return "myButton";
	}
}
