package com.aprilc.portfolio.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	@RequestMapping("/")
    public String index() {
            return "forward:/index.html";
    }
	
	@RequestMapping("/me")
    public String about() {
            return "forward:/about.html";
    }
	
	@RequestMapping("/project")
    public String projects() {
            return "forward:/projects.html";
    }
    
}
