package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	protected static Logger logger = LoggerFactory
			.getLogger(HelloController.class);

	@RequestMapping("/hello/{name}")
	public String helloName(@PathVariable String name) {
		logger.debug("∑√Œ helloName,Name={}", name);
		return "Hello " + name;
	}

	@RequestMapping("/")
	public String hellowordl(Model model) {
		logger.debug("∑√Œ hello");
		model.addAttribute("name", "345");
		System.out.println("getall!!!!!");
		return "demo";
	}
}
