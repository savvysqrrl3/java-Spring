package com.aprilc.relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aprilc.relationships.models.Person;
import com.aprilc.relationships.repositories.PersonRepo;

@Service
public class RelationshipService {
	private PersonRepo pRepo;
	public RelationshipService(PersonRepo pRepository) {
		this.pRepo = pRepository;
	}


	public void addPerson(Person person) {
		pRepo.save(person);
	}
	
	public List<Person> allPeople() {
        return pRepo.findAll();
    }
	
}
