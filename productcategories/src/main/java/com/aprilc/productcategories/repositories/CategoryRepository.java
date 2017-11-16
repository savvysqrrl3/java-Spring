package com.aprilc.productcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aprilc.productcategories.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	List<Category> findAll();

}
