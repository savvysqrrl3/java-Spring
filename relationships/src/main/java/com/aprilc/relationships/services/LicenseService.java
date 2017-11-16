package com.aprilc.relationships.services;

import org.springframework.stereotype.Service;

import com.aprilc.relationships.models.License;
//import com.aprilc.relationships.models.Person;
import com.aprilc.relationships.repositories.LicenseRepo;
import com.aprilc.relationships.repositories.PersonRepo;

@Service
public class LicenseService {
	private LicenseRepo lRepo;
//	private PersonRepo pRepo;
	public LicenseService(LicenseRepo lRepository, PersonRepo pRepository) {
		this.lRepo = lRepository;
//		this.pRepo = pRepository;
	}
	private int licenseNum = 00001;
	
//	public Person getPerson(Long id) {
//		return pRepo.findOne(id);
//	}
	
	public License addLicense(License license) {
		
//		Long personId = license.getPerson().getId();
		
		// Pad with 0 with a width of 6
//				String licNumber = String.format("%06d", personId);

		license.setNumber(licenseNum);
		licenseNum += 1;
		
		License newlic = lRepo.save(license);
		return newlic;
	}
}
