package com.exam.twitter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublicController {

	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	
}
