package com.aprilc.dojoninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aprilc.dojoninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();

}
