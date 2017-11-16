package com.aprilc.productcategories.services;

import org.springframework.stereotype.Service;

import com.aprilc.productcategories.models.categories_products;
import com.aprilc.productcategories.repositories.JoinRepo;

@Service
public class JoinService {
	private JoinRepo jRepo;
	public JoinService(JoinRepo jRepository) {
		this.jRepo = jRepository;
	}
	
	public void addJoin(categories_products catprod, Long catId, Long prodId) {
		jRepo.save(catprod);
	}
	
	public void addCategory(categories_products catProd) {
		jRepo.save(catProd);
	}

}
