package com.aprilc.productcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aprilc.productcategories.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findAll();
}
