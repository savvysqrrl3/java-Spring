package com.aprilc.ninjagold.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoldController {
	@RequestMapping("/")
	 public String index(HttpSession session) {
		Integer gold = (Integer) session.getAttribute("gold");
		if(gold == null) {
			session.setAttribute("gold", 0);
		}
		return "index";
	    }
	@RequestMapping(path="/process", method=RequestMethod.POST)
	 public String process(HttpSession session, @RequestParam("location") String location) {
		Integer gold = (Integer) session.getAttribute("gold");
		int newGold;
		
		System.out.println(location);
		switch(location) {
		case "farm": newGold = (int) (Math.random() * 11 + 10);break;
		case "cave": newGold = (int) (Math.random() * 11 + 5);break;
		case "house": newGold = (int) (Math.random() * 11 + 2);break;
		case "casino": newGold = (int) (Math.random() * 11 + 50);break;
		default: newGold = 0;
		
		}
		System.out.println(newGold);
		session.setAttribute("gold", gold + newGold);
		
		return "redirect:/";
	    }
	
	@RequestMapping("/reset")
	 public String reset(HttpSession session) {
		session.setAttribute("gold", 0);
		return "redirect:/";
	    }
}
