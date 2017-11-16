package com.aprilc.relationships.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aprilc.relationships.models.License;
import com.aprilc.relationships.models.Person;
import com.aprilc.relationships.services.LicenseService;
import com.aprilc.relationships.services.RelationshipService;

@Controller
public class RelationshipController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	private final RelationshipService rService;
	private final LicenseService lService;
	public RelationshipController(RelationshipService relationshipService, LicenseService licenseService) {	
		this.rService = relationshipService;	
		this.lService = licenseService;
	}
	
	@RequestMapping("/")
    public String relationships() {
        return "redirect:people/new";
    }
	
	@RequestMapping("/people/new")
    public String person(@ModelAttribute("person") Person person) {
        return "person";
    }
	
	@PostMapping("/people/new")
    public String createPerson(Model model, @ModelAttribute("person") Person person) {
        rService.addPerson(person);
		return "redirect:/licenses/new";
    }
	
	@RequestMapping("/licenses/new")
    public String license(Model model, @ModelAttribute("license") License license) {
		
//		List<License> licenses = lService.allLicenses();
		List<Person> personList = rService.allPeople();
//	    model.addAttribute("licenses", licenses);
	    model.addAttribute("people", personList);

//	    HashMap<Long, String> people = new HashMap<>();
//
//	    for(Person p : personList ){
//	         people.put(p.getId() , p.getFirstName());
//	    };
//	    
//	    model.addAttribute("people", people);
		
        return "license";
    }
	
	@PostMapping("/licenses/addnew")
    public String createLicense(@Valid @ModelAttribute("license") License license, Model model, BindingResult result) {
		System.out.println("HERE !!");
//		return "redirect:/licenses/new";
		return "license";
		
//		if(result.hasErrors()) {
//			model.addAttribute("people", rService.allPeople());
//			System.out.println(result);
//			System.out.println("HERE!");
//			return "/licenses/new.jsp";
//		} else {
//			License lic = lService.addLicense(license);
//			String personId = Long.toString(lic.getPerson().getId());
//			Long personId = lic.getPerson().getId();
//			return "redirect:/license";
//					.concat(personId);
//		}
		
    }
	
	@RequestMapping("/people/{id}")
    public String showPerson() {
        return "display";
    }
	
	
	
}
