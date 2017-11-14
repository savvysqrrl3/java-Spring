package com.aprilc.grouplanguages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aprilc.grouplanguages.models.Language;

public interface LanguageRepository extends CrudRepository<Language, Long> {
	List<Language> findAll();
}
