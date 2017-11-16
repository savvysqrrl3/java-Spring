package com.aprilc.productcategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aprilc.productcategories.models.Category;
import com.aprilc.productcategories.models.Product;
import com.aprilc.productcategories.repositories.CategoryRepository;
import com.aprilc.productcategories.repositories.ProductRepository;

@Service
public class ProductService {
	private ProductRepository pRepo;
	public ProductService(ProductRepository pRepository) {
		this.pRepo = pRepository;
	}
	
	public void addProduct(Product prod) {
		pRepo.save(prod);
	}
	
	public List<Product> allProducts() {
        return pRepo.findAll();
    }
	
	public Product getProdById(Long id) {
		return pRepo.findOne(id);
	}

}
