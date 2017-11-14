package com.aprilc.dojoninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aprilc.dojoninjas.models.Ninja;
import com.aprilc.dojoninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private NinjaRepository nRepo;
	public NinjaService(NinjaRepository nRepository) {
		this.nRepo = nRepository;
	}
	
	public void addNinja(Ninja ninja) {
		nRepo.save(ninja);
	}
	
	public List<Ninja> allNinjas() {
        return nRepo.findAll();
    }

}
