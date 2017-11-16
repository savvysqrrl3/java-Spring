package com.aprilc.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aprilc.relationships.models.Person;

public interface PersonRepo extends CrudRepository<Person, String> {
	List<Person> findAll();

//	Person findOne(Long id);
}
