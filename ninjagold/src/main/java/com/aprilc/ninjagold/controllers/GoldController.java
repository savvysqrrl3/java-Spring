package com.aprilc.ninjagold.controllers;

import java.util.concurrent.ThreadLocalRandom;

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
		case "farm": newGold = (int) ThreadLocalRandom.current().nextInt(10, 20 + 1);break;
		case "cave": newGold = (int) ThreadLocalRandom.current().nextInt(5, 10 + 1);break;
		case "house": newGold = (int) ThreadLocalRandom.current().nextInt(2, 5 + 1);break;
		case "casino": newGold = (int) ThreadLocalRandom.current().nextInt(0, 50 + 1);break;
		default: newGold = 0;
		}
		int chance = ThreadLocalRandom.current().nextInt(0, 2);
		System.out.println("chance" + chance);
		System.out.println("new gold" + newGold);
		if (chance == 0 && location.equals("casino")) {
			session.setAttribute("gold", gold - newGold);	
		}
		else {
		session.setAttribute("gold", gold + newGold);
		}
		return "redirect:/";
	    }
	
	@RequestMapping("/reset")
	 public String reset(HttpSession session) {
		session.setAttribute("gold", 0);
		return "redirect:/";
	    }
}
