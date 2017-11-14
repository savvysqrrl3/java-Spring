package com.aprilc.dojoninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aprilc.dojoninjas.models.Dojo;
import com.aprilc.dojoninjas.repositories.DojoRepository;

@Service
public class DojoService {
	private DojoRepository dRepo;
	public DojoService(DojoRepository dRepository) {
		this.dRepo = dRepository;
	}
	
	public void addDojo(Dojo dojo) {
		dRepo.save(dojo);
	}
	
	public List<Dojo> allDojos() {
        return dRepo.findAll();
    }
	
	public Dojo getDojoById(Long id) {
		return dRepo.findOne(id);
	}
	
}
