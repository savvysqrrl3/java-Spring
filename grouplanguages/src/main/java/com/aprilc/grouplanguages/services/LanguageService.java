package com.aprilc.grouplanguages.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aprilc.grouplanguages.models.Language;
import com.aprilc.grouplanguages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	private LanguageRepository langRepository;
    public LanguageService(LanguageRepository langRepository){
        this.langRepository = langRepository;
    }
    
	private List<Language> langs = new ArrayList(Arrays.asList());
    
    // returns all the books
    public List<Language> allLanguages() {
        return langRepository.findAll();
    }
    
    public void addLang(Language lang) {
        langRepository.save(lang);
    }
    
    public Language findLangById(Long id) {
        return langRepository.findOne(id);
    }
    
    public void destroyLang(Long id) { 
        langRepository.delete(id);
    } 
    
    public void updateLang(Language lang) {
        langRepository.save(lang);
    }

}
