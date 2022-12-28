package com.learning.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String giveWelcomeMessage(ModelMap model) {
		model.addAttribute("message", " Welcome to SpringThymeleaf");
		return "welcome";
	}

}
