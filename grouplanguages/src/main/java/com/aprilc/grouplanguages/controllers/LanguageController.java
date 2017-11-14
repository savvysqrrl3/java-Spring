package com.aprilc.grouplanguages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aprilc.grouplanguages.models.Language;
import com.aprilc.grouplanguages.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService languageService;
    public LanguageController(LanguageService languageService){
        this.languageService = languageService;
    }
    @RequestMapping("/languages")
    public String languages(Model model, @ModelAttribute("lang") Language lang) {
        List<Language> languages = languageService.allLanguages();
        model.addAttribute("langs", languages);
        return "index";
    }
    
    @PostMapping("/languages/new")
    public String createLang(@Valid @ModelAttribute("lang") Language lang, BindingResult result) {
    		if (result.hasErrors()) {
            return "redirect:/languages";
        }
    		else{
            languageService.addLang(lang);
            return "redirect:/languages";
    		}
    
    }
    
    @RequestMapping("/languages/{id}")
    public String findLangByIndex(Model model, @PathVariable("id") Long id) {
        Language lang = languageService.findLangById(id);
        model.addAttribute("lang", lang);
        model.addAttribute("idx", id);
        return "show";
    }
    
    @RequestMapping(value="/languages/delete/{id}")
    public String destroyLang(@PathVariable("id") Long id) {
        languageService.destroyLang(id);
        return "redirect:/languages";
    }
    
    @RequestMapping("/languages/edit/{id}")
    public String editLang(@PathVariable("id") Long id, Model model) {
        Language lang = languageService.findLangById(id);
        if (lang != null){
            model.addAttribute("lang", lang);
            model.addAttribute("idx", id);
            return "update";
        }else{
            return "redirect:/languages";
        }
    }
    
    @PostMapping("/languages/edit/{id}")
    public String updateLang(@PathVariable("id") int id, @Valid @ModelAttribute("lang") Language lang, BindingResult result) {
        if (result.hasErrors()) {
            return "update";
        }else{
            languageService.updateLang(lang);
            return "redirect:/languages";
        }
    }

 }
