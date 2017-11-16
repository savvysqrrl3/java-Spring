package com.aprilc.productcategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aprilc.productcategories.models.Category;
import com.aprilc.productcategories.repositories.CategoryRepository;


@Service
public class CategoryService {
	private CategoryRepository cRepo;
	public CategoryService(CategoryRepository cRepository) {
		this.cRepo = cRepository;
	}
	
	public void addCat(Category cat) {
		cRepo.save(cat);
	}
	
	public List<Category> allCats() {
        return cRepo.findAll();
    }

	
	public Category getCatById(Long id) {
		return cRepo.findOne(id);
	}
	

}
