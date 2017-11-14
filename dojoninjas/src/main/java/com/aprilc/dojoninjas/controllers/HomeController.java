package com.aprilc.dojoninjas.controllers;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aprilc.dojoninjas.models.Dojo;
import com.aprilc.dojoninjas.models.Ninja;
import com.aprilc.dojoninjas.services.DojoService;
import com.aprilc.dojoninjas.services.NinjaService;

@Controller
public class HomeController {
	private final DojoService dService;
	private final NinjaService nService;
	public HomeController(DojoService dojoService, NinjaService ninjaService) {	
		this.dService = dojoService;
		this.nService = ninjaService;
	}
	
	@RequestMapping("/")
    public String dojoshome() {
        return "redirect:dojos/new";
    }
	
	@RequestMapping("/dojos/new")
    public String newdojo(Model model,@ModelAttribute("dojo") Dojo dojo) {
        return "index";
    }
	
	@PostMapping("/dojos/new")
	public String createDojo(Model model, @ModelAttribute("dojo") Dojo dojo) {
        dService.addDojo(dojo);
		return "redirect:/dojos/new";
    }
	
	@RequestMapping("/ninjas/new")
    public String addninja(Model model, @ModelAttribute("ninja") Ninja ninja) {
		List<Dojo> dojoList = dService.allDojos();
		model.addAttribute("dojos", dojoList);
        return "newninja";
    }
	
	@PostMapping("/ninjas/new")
    public String createNinja(Model model, @ModelAttribute("ninja") Ninja ninja) {
		nService.addNinja(ninja);
        return "redirect:/ninjas/new";
    }
	
	@RequestMapping("/dojos/{id}")
    public String dojoninjas(Model model, @PathVariable("id") Long id, @ModelAttribute("dojo") Dojo dojo) {
		List<Ninja> ninjas = nService.allNinjas();
		Dojo thisDojo = dService.getDojoById(id);
		model.addAttribute(thisDojo);
		model.addAttribute(ninjas);
		
        return "showdojo";
    }
}
