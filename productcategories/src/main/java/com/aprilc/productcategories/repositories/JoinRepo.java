package com.aprilc.productcategories.repositories;

import org.springframework.data.repository.CrudRepository;

import com.aprilc.productcategories.models.categories_products;

public interface JoinRepo extends CrudRepository<categories_products, Long> {
	
}
